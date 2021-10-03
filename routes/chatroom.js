var express = require('express');
var router = express.Router();
var  {v4 : uuidv4} = require('uuid');
var Message = require('../models/Message');

router.get('/', async function(req, res, next){
    var cookie = req.cookies.customerInfo;
    if (cookie === undefined) {
        // no: set a new cookie
        res.redirect('/chatroom/regist');
        console.log('cookie has not exist!');
    } else {
        // yes: cookie was already present 
        console.log('cookie exists', cookie);

        const messages = await Message.find({}).exec();
        console.log("message: ", messages);

        res.render('chatroom', {
            title: 'Chat room',
            tab: 'blog',
            customerInfo: cookie,
            messages: messages,
        });
    }

    next();
});

router.get('/regist', async function(req, res, next){
    res.render('chatroom_regist', {
        title: 'Chat room',
    });

    next();
});

router.post('/regist', async function(req, res, next){
    let customer = {
        name : req.body.name,
        id : uuidv4(),
    }
    console.log('regist success: ', customer);
    // Add cookie doesn't expire
    res.cookie('customerInfo', customer, { expires: new Date(253402300000000), httpOnly: true });

    res.send(req.body.name + " is registed !!");
    next();
});



// ====================  PRIVATE FUNCTION ====================

module.exports = router;