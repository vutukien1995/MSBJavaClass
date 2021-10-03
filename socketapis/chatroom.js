const io = require( "socket.io" )();
const socketapi = { io: io };
var Message = require('../models/Message');

// Add your socket.io logic here!
const activeUsers = new Set();

io.on("connection", function (socket) {
  console.log("user " + socket.id + " connected");

    // socket.on("new user", function (data) {
    //   socket.userId = data;
    //   activeUsers.add(data);
    //   io.emit("new user", [...activeUsers]);
    // });

    socket.on("disconnect", () => {
        console.log("user disconnected");
    });

    socket.on('chat message', (input) => {
        let message = new Message();
        message.message = input.message;
        message.id = input.id;
        message.name = input.name;

        message.save();

        console.log('message: ', input);
        socket.broadcast.emit("chat message", input);
    });

    // socket.on("chat message", function (data) {
    //   io.emit("chat message", data);
    // });
  
    socket.on("typing", function (data) {
        socket.broadcast.emit("typing", data);
    });
});
// end of socket.io logic

module.exports = socketapi;