    
// Check Authenticating
module.exports.isAuthenticated = function (req, res, next) {
	if (req.isAuthenticated())
		return next();
	res.redirect('/user/login');
};