window.onload = function(){
	document.getElementById('newGame').addEventListener('click', getNewGame, false);
	document.getElementById('recommendedGame').addEventListener('click', getRecommendedGame, false);
	const tags = document.getElementsByName('tag');
	tags.forEach((tag) => {
		tag.addEventListener('click', getCheckboxValue, false);
	});
	document.getElementById('recommendedPost').addEventListener('click', getRecommendedPost, false);
	document.getElementById('mostViewPost').addEventListener('click', getMostViewPost, false);
	document.getElementById('recommendedQnA').addEventListener('click', getRecommendedQnA, false);
	document.getElementById('mostViewQnA').addEventListener('click', getMostViewQnA, false);
};

function getNewGame(){
	console.log('click1');
}

function getRecommendedGame(){
	console.log('click2');
}

function getCheckboxValue(){
	const query = 'input[name="tag"]:checked';
	const selectedEls = 
		document.querySelectorAll(query);
	
	let result = '';
	selectedEls.forEach((el) => {
		result += el.value + ' ';
	});
	
	console.log(result);
}

function getRecommendedPost(){
	console.log('click3');
}

function getMostViewPost(){
	console.log('click4');
}

function getRecommendedQnA(){
	console.log('click5');
}

function getMostViewQnA(){
	console.log('click6');
}