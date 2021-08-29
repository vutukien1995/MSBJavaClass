var express = require('express');
var router = express.Router();

var Post = require('../models/Post');
var Image = require('../models/Image');
var Category = require('../models/Category');
var Quote = require('../models/Quote');

/* GET home page. */
router.get('/', function(req, res, next){
    res.redirect('/home/0');
});

router.get('/home', function(req, res, next){
    res.redirect('/home/0');
});

router.get('/home/:page', async function home(req, res, next) {
    try {
        var page = req.params.page;

        if(!page || isNaN(page)) {
            page = 0;
        } 
        
        const options = {
            populate: "image",
            sort: { dateOfCreate: -1 },
            offset: parseInt(page),
            limit: 5
        };

        const categories = await Category.find({}).exec();
        
        // Get quote to show
        let quote;
        const quotes = await Quote.find({}).exec();
        if (quotes != null) {
            let randomNumber = Math.floor(Math.random()*quotes.length);
            console.log("=========>>>>>>>", randomNumber);
            quote = quotes[randomNumber];
        }

        Post.paginate({ active: true }, options).
        then(function (result) {

            console.log('total: ', result.total);
            console.log('offset: ', result.offset);
            console.log('pages: ', Math.round(result.total/result.limit));

            var posts = result.docs;

            posts.forEach( async function(post) {
                var str = post.content;
                if(str) post.content = str.slice(0, 150);
            });

            res.render('index', {
                title: 'Blog neko',
                tab: 'home',
                posts: posts,
                categories: categories,
                pages: Math.round(result.total/result.limit),
                page: result.offset+1,
                limit: result.limit,
                user: req.user,
                quote: quote
            });
        });
    } catch (err) {
        res.send({
            name: err.name,
            message: err.message
        });
        next(err);
    }
});



module.exports = router;
