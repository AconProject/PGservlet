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

/* JSP에 새로운 태그 및 컨텐츠 삽입 */
function insertElement(childTag, parentId, content, attr, attrVal){
	let newEle = document.createElement(childTag);
	if (attr && attrVal){
		newEle.setAttribute(attr, attrVal);
	}
	newEle.innerHTML = content;
	let parentEle = document.getElementById(parentId);
	parentEle.appendChild(newEle);
}

/* 상단에 표시할 게임데이터 파싱 후 출력 */
function jsonParserForTop(data){
	// servlet 변경 후
	// for (let i=0; i<data.length; i++){
	for (let i=0; i<10; i++){
		let jsonObj = JSON.parse(data[i]);
		console.log(jsonObj);
		console.log(jsonObj.gameCategory);
		console.log(jsonObj.gameReleasedDate);
		if (i<3){
			insertElement('td', 'topTableNum', (i+1)+'.');
			insertElement('td', 'topTableImg',
				'<img class="gameImg" src="'+jsonObj.gameImage+'">');
			insertElement('td', 'topTableName', jsonObj.gameName);
			// 게임 대표장르, 출시년도 데이터 필요
		} else {
			insertElement('li', 'topChart', jsonObj.gameName);
			// 게임 출시년도 데이터 필요
		}
	}
}

/* 상단 최신게임 불러오기 */
function getNewGame(){
	fetch('GameListServlet')
		.then(res => res.json())
		.then(data => {
			jsonParserForTop(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 상단 추천게임 불러오기 */
function getRecommendedGame(){
	// fetch('GameListServlet')
	// 	.then(res => res.json())
	// 	.then(data => {
	// 		jsonParserForTop(data);
	// 	})
	// 	.catch(err => {
	// 		console.log(err);
	// 	});
}

/* 중단 태그별 게임 불러오기 */
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

/* 중단 태그 클릭시 게임리스트 변경 */
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

/* 하단 게임게시판 최신순으로 불러오기 */
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

/* 하단 게임게시판 추천수 정렬 */
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

/* 하단 게임게시판 조회수 정렬 */
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

/* 하단 QnA게시판 최신순으로 불러오기 */
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

/* 하단 QnA게시판 추천수 정렬 */
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

/* 하단 QnA게시판 조회수 정렬 */
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

/* 하단 뉴스게시판 불러오기 */
function getNews(){
	//
}