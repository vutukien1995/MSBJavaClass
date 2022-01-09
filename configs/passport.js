
const passport = require('passport');
const User = require('../models/User');
const LocalStrategy = require('passport-local').Strategy;

passport.serializeUser(function(user, done) {
    done(null, user.id);
});

passport.deserializeUser(function(id, done) {
    User.findById(id, function(err, user) {
        done(err, user);
    });
});

passport.use("login", new LocalStrategy({
        passReqToCallback : true
    }, function(req, username, password, done) {
        console.log(" ====> ????? ");
        // check in mongo if a user with name exists or not
        User.findOne({ username :  username }).
        exec(function(err, user) {
            console.log(user);
            // In case of any error, return using the done method
            if (err)
                return done(err);
            // Userame does not exist, log error & redirect back
            if (!user || !user.password){
                console.log('User Not Found with username '+ username);
                return done(null, false, req.flash('message', 'User Not found.'));
            }
            // User exists but wrong password, log the error
            if (!(password == user.password)){
                console.log('Invalid Password');
                return done(null, false, req.flash('message', 'Invalid Password'));
            }
            // User and password both match, return user from
            // done method which will be treated like success
            return done(null, user);
            // bcrypt.compare(password, user.password, function (err, result) {
            //     if (!result){
            //         console.log('Invalid Password');
            //         return done(null, false, req.flash('message', 'Invalid Password'));
            //     }
            //     // User and password both match, return user from
            //     // done method which will be treated like success
            //     return done(null, user);
            // });
            });
    }));
