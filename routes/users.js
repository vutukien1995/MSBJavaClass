var express = require('express');
var router = express.Router();

var User = require('../models/User');
var Category = require('../models/Category');

var passport = require('passport');

/* Login GET */
router.get('/login', async function(req, res) {
	try {
		var categories = await Category.find({}).exec();

		res.render('login', {
			tab: 'admin',
			user: req.user,
			message: req.flash('message'),
			categories: categories
		});
	} catch (err) {
		res.send({
            name: err.name,
            message: err.message
        });
	}
});	

/* Login POST */
router.post('/login', passport.authenticate("login", {
    successRedirect: '/',
    failureRedirect: '/user/login',
    failureFlash : true
}));

/* Handle Logout */
router.get('/logout', function(req, res) {
    req.logout();
    res.redirect('/');
});

router.get('/create_user', function(req, res){
	var user = new User({
		username: 'admin',
		password: 'kien'
	});

	user.save(function(err, new_user){
		if(err) return res.send(err);

		res.send({ 
			success: true, 
			message: "Success !!",
			user: new_user
		});
	});
});

module.exports = router;
