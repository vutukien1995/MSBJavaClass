var express = require('express');
var router = express.Router();

var Post = require('../models/Post');
var Category = require('../models/Category');

/**
 * Show a category
 */
router.get('/:category/:page', async function(req, res, next){
    try {
        var page = req.params.page;
        if(!page || isNaN(page)) {
            page = 0;
        } 
        
        var categories = await Category.find({}).exec();
        var category = await Category.findOne({ name: req.params.category }).exec();

        var options = {
            sort: { dateOfCreate: -1 },
            offset: parseInt(page),
            limit: 12
        };
        
        Post.paginate({ categories: req.params.category }, options).
        then(function (result) {

            console.log('total: ', result.total);
            console.log('offset: ', result.offset);
            console.log('pages: ', Math.ceil(result.total/result.limit));

            var posts = result.docs;

            posts.forEach(function(post) {
                var str = post.content;
                if(str) post.content = str.slice(0, 150);
            });

            res.render('category', {
                title: req.params.category,
                tab: 'categories',
                categories: categories,
                category: category,
                posts: posts,
                pages: Math.ceil(result.total/result.limit),
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
        next(err);
    }
});

/**
 * Search post
 */
router.get('/search_post', async function(req, res, next){
    try {
        var key = req.query.key;
        
        var categories = await Category.find({}).exec();

        Post.find({ $text: { $search: key } })
        .exec(function (err, result) {
            //if (err) return res.send(err);
            console.log(result);
            var posts = result;

            if(posts) {
                posts.forEach(function(post) {
                    var str = post.content;
                    if(str) post.content = str.slice(0, 120);
                });
            }

            res.render('category', {
                title: '',
                tab: 'categories',
                categories: categories,
                category: '',
                posts: posts,
                limit: result.limit,
                pages: 0,
                user: req.user
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

router.get('/add_new', async function(req, res, next){
    try {
        var categories = await Category.find({}).exec();
        
        Category.find({}).
        exec(function(err, categories){
            res.render('category_add_new', {
                title: 'Add new Category',
                tab: 'category',
                message: req.flash('message'),
                user: req.user,
                categories: categories
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

router.post('/add_new', function(req, res){

    var category = new Category({
        name : req.body.name,
        description: req.body.description
    });

    category.save(function(err, category){
        if(err) return res.send(err);

        req.flash('message', 'Add new category: ' + category.name);

        res.redirect('/category/add_new');
    });

});


module.exports = router;