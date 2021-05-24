window.onload = function(){
	console.log('javascript');
	document.getElementById('write').addEventListener('click', function(){
		location.href = '../Board/writeBoard.jsp';
	}, false);
};