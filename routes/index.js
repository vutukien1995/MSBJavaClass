var express = require('express');
var router = express.Router();

var Post = require('../models/Post');
var Image = require('../models/Image');
var Category = require('../models/Category');
var Quote = require('../models/Quote');

/* GET home page. */
router.get('/', home);
router.get('/page/:page', home);

async function home(req, res, next) {
    try {
        var page = req.params.page;

        if(!page || isNaN(page)) {
            page = 0;
        } 
        
        const options = {
            populate: "image",
            sort: { dateOfCreate: -1 },
            offset: parseInt(page),
            limit: 10
        };

        const categories = await Category.find({}).exec();
        let quote;
        const quotes = await Quote.find({}).exec();
        console.log("=========>>>>>>>", quotes);
        if (quotes != null) {
            let randomNumber = Math.floor(Math.random()*quotes.length);
            console.log("=========>>>>>>>", randomNumber);
            quote = quotes[randomNumber];
        }

        console.log("=========>>>>>>>", quote);

        Post.paginate({ active: true }, options).
        then(function (result) {

            //if (err) return res.send(err);
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
                pages: result.total/result.limit+1,
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
}

module.exports = router;
