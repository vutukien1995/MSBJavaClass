var express = require('express');
var router = express.Router();

var Post = require('../models/Post');
var Image = require('../models/Image');
var Category = require('../models/Category');

/* GET home page. */
router.get('/', home);
router.get('/page/:page', home);

async function home(req, res) {
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
        
        Post.paginate({ active: true }, options).
        then(function (result) {

            //if (err) return res.send(err);
            var posts = result.docs;

            posts.forEach( async function(post) {
                var str = post.content;
                if(str) post.content = str.slice(0, 150);
            });

            res.render('index', {
                title: 'Blog K',
                tab: 'home',
                posts: posts,
                categories: categories,
                pages: result.total/result.limit+1,
                page: result.offset+1,
                limit: result.limit,
                user: req.user
            });
        });
    } catch (err) {
        res.send({
            name: err.name,
            message: err.message
        });
    }
}

module.exports = router;
