let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let QuoteSchema = new Schema({

    content: { type: String },
    author: { type: String },

    dateOfCreate: { type: Date, default: Date.now },
    dateOfUpdate: { type: Date }
});

module.exports = mongoose.model('Quote', QuoteSchema);