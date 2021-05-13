window.onload = function(){
	// 버튼 클릭 이벤트 등록
	document.getElementById('newGame').addEventListener('click', getNewGame, false);
	document.getElementById('recommendedGame').addEventListener('click', getRecommendedGame, false);
	document.getElementById('recommendedPost').addEventListener('click', getRecommendedPost, false);
	document.getElementById('mostViewPost').addEventListener('click', getMostViewPost, false);
	document.getElementById('recommendedQnA').addEventListener('click', getRecommendedQnA, false);
	document.getElementById('mostViewQnA').addEventListener('click', getMostViewQnA, false);

	// 중단 게임 태그 선택 이벤트 등록 
	const tags = document.getElementsByName('tag');
	tags.forEach((tag) => {
		tag.addEventListener('click', getCheckboxValue, false);
	});

	getNewGame();
	
};

// 상단 최신게임 불러오기
function getNewGame(){
	fetch('GameListServlet')
		.then(res => res.text())
		.then(data => {
			console.log(data);
		})
		.catch(err => {
			console.log(err);
		});
}

// 상단 추천게임 불러오기
function getRecommendedGame(){
	console.log('click2');
}

// 중단 태그별 게임 불러오기
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

// 하단 게임게시판 추천수 정렬
function getRecommendedPost(){
	console.log('click3');
}

// 하단 게임게시판 조회수 정렬
function getMostViewPost(){
	console.log('click4');
}

// 하단 QnA게시판 추천수 정렬
function getRecommendedQnA(){
	console.log('click5');
}

// 하단 QnA게시판 조회수 정렬
function getMostViewQnA(){
	console.log('click6');
}