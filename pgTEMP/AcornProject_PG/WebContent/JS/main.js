window.onload = function() {
	console.log('js test');
	document.getElementById('newGame').addEventListener('click', getNewGame, false);
	document.getElementById('recommendedGame').addEventListener('click', getRecommendedGame, false);
	const tags = document.getElementsByName('tag');
	tags.forEach((e) => {
		e.addEventListener('click', function(){
			console.log('checked');
		}, false);
	});
};

function getNewGame() {
	// 임시 코드
	console.log('click1');
}

function getRecommendedGame(){
	// 임시 코드
	console.log('click2');
}

// function getCheckboxValue() {
// 	console.log('이벤트 동작 확인');
// 	const query = 'input[name="tag"]:checked';
// 	const selectedEls = 
// 		document.querySelectorAll(query);
	
// 	// 임시 코드
// 	let result = '';
// 	selectedEls.forEach((el) => {
// 		result += el.value + ' ';
// 	});
	
// 	// 출력
// 	document.getElementById('result').innerText = '선택된 태그: ' + result;
// }