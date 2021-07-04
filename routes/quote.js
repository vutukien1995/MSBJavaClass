var express = require('express');
var router = express.Router();

var Image = require('../models/Image');
var Category = require('../models/Category');
var Commons = require('../commons/Authentication');
var Quote = require('../models/Quote');

router.post('/', async function(req, res, next){
	try {
        req.body.quotes.forEach(async element => {
            let q = new Quote();
            q.content = element.content;
            q.author = element.author;
            
            await q.save();
        });

		res.send({
            status: 'success',
            content: req.body.quotes
        });
		
		next();
	} catch (err) {
		res.send({
            name: err.name,
            message: err.message
        });
		
		next(err);
	}
});


module.exports = router;