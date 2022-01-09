var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var session = require('express-session');
var flash = require('connect-flash');
var bodyParser = require('body-parser');
var passport = require('passport');

// Configs
require('./configs/db');
require('./configs/passport');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var postRouter = require('./routes/post');
var imageRouter = require('./routes/image');
var categoryRouter = require('./routes/category');
var adminRouter = require('./routes/admin');
var quoteRouter = require('./routes/quote');
var chatroomRouter = require('./routes/chatroom');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

// Config passport
// app.use(bodyParser.json());       
// app.use(bodyParser.urlencoded({ extended: true })); 
app.use(session({
    secret : "secret_key",
    cookie: {
        // secure: true,
        maxAge: 1800000
    }, // 30 minutes until expire.
    // saveUninitialized: true,
    // resave: false
}));
app.use(passport.initialize());
app.use(passport.session());
app.use(flash());

app.use('/', indexRouter);
app.use('/user', usersRouter);
app.use('/post', postRouter);
app.use('/image', imageRouter);
app.use('/category', categoryRouter);
app.use('/admin', adminRouter);
app.use('/quote', quoteRouter);
app.use('/chatroom', chatroomRouter);




// catch 404 and forward to error handler
// app.use(function(req, res, next) {
//   next(createError(404));
// });

// error handler
// app.use(function(err, req, res, next) {
//   // set locals, only providing error in development
//   res.locals.message = err.message;
//   res.locals.error = req.app.get('env') === 'development' ? err : {};

//   // render the error page
//   res.status(err.status || 500);
// //   res.render('error');
//     res.send('error');
// });

module.exports = app;
