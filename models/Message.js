let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let MessageSchema = new Schema({

    id: { type: String },
    name: { type: String },
    message: { type: String },

    dateOfCreate: { type: Date, default: Date.now },
    dateOfUpdate: { type: Date }
});

module.exports = mongoose.model('Message', MessageSchema);