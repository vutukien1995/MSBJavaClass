let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let ImageSchema = new Schema({
    user: { type: String },

    url: { type: String },
    url_thumb: { type: String },
    path: { type: String },

    dateOfCreate: { type: Date, default: Date.now },
    dateOfUpdate: { type: Date }
});

module.exports = mongoose.model('Image', ImageSchema);