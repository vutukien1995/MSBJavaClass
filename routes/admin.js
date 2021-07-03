var express = require('express');
var router = express.Router();

var multer  = require('multer');
var fs = require('fs');

var Image = require('../models/Image');
var Category = require('../models/Category');
var Commons = require('../commons/Authentication');


/**
 * Admin
 */
router.get('/', Commons.isAuthenticated, async function(req, res, next){
	try {
		res.send("admin");
		
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