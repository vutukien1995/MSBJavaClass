module.exports.upload_config = function (req, res, next) {
    const multer  = require('multer');

    // Initialize data
    let IMAGE_KEY = "image";
    let PREFIX_NAME = IMAGE_KEY;
    let FILE_PATH = "public/uploads";
    
    // Config image upload
    let storage = multer.diskStorage({
        destination: function (req, file, cb) {
            cb(null, FILE_PATH);
        },
        filename: function (req, file, cb) {
            cb(null, PREFIX_NAME + '_' + Date.now() + '.jpg');
        }
    });
    let upload = multer({ storage: storage }).array(IMAGE_KEY, 20);

    return upload(req, res, next);
}


module.exports.deleteFile = function(path) {
    if( fs.existsSync(image.path) ) {
        fs.unlinkSync(image.path);
        return true;
    }
}


module.exports.deleteImage = async function(image_id) {
    const Image = require('../models/Image');
    var fs = require('fs');

    let image = await Image.findOne({ _id: image_id }).exec();

    // Delete image file
    if( fs.existsSync(image.path) ) {
        fs.unlinkSync(image.path);
    }

    // Remove from mongo db
    await image.remove();

    return true;
}