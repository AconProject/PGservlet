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
	getTagGame();
	getNewPost();
	getNewQnA();
	getNews();
};

function jsonParser(data){
	console.log(data[0]);
}

// 상단 최신게임 불러오기
function getNewGame(){
	fetch('GameListServlet')
		.then(res => res.json())
		.then(data => {
			jsonParser(data);
		})
		.catch(err => {
			console.log(err);
		});
}

// 상단 추천게임 불러오기
function getRecommendedGame(){
	fetch('GameListServlet')
		.then(res => res.json())
		.then(data => {
			console.log(data[0]);
		})
		.catch(err => {
			console.log(err);
		});
}

// 중단 태그별 게임 불러오기
function getTagGame(){
	// fetch('GameTagListServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 중단 태그 클릭시 게임리스트 변경
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

// 하단 게임게시판 최신순으로 불러오기
function getNewPost(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 게임게시판 추천수 정렬
function getRecommendedPost(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 게임게시판 조회수 정렬
function getMostViewPost(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 QnA게시판 최신순으로 불러오기
function getNewQnA(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 QnA게시판 추천수 정렬
function getRecommendedQnA(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 QnA게시판 조회수 정렬
function getMostViewQnA(){
	// fetch('BoardListMainServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		console.log(data[0]);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

// 하단 뉴스게시판 불러오기
function getNews(){
	//
}