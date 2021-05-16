window.onload = function(){
	// 버튼 클릭 이벤트 등록
	document.getElementById('newGame').addEventListener('click', getNewGameEvent, false);
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

/* 모든 요소 삭제(데이터 갱신 시 기존 데이터 삭제 위함) */
function removeAllElements(query) {
	let removeEles = document.querySelectorAll(query);
	for (let i=0; i<removeEles.length; i++){
		removeEles[i].parentNode.removeChild(removeEles[i]);
	}
}

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
	for (let i=0; i<data.length; i++){
		let jsonObj = JSON.parse(data[i]);
		if (i<3){
			insertElement('td', 'topTableNum', (i+1)+'.');
			insertElement('td', 'topTableImg',
				'<img class="gameImg" src="'+jsonObj.gameImage+'">');
			insertElement('td', 'topTableName', jsonObj.gameName);
			insertElement('td', 'topTableYear',
				jsonObj.gameReleasedDate, 'class', 'center');
			insertElement('td', 'topTableCategory',
				'#'+jsonObj.gameCategory, 'class', 'center tag');
		} else {
			insertElement('li', 'topChart',
				jsonObj.gameName + jsonObj.gameReleasedDate);
		}
	}
}

/* 중단에 표시할 게임데이터 파싱 후 출력 */
function jsonParserForMiddle(data){
	for (let i=0; i<data.length; i++){
		console.log(data[i]);
	}
}

/* 상단 최신게임 불러오기(페이지 첫 로딩) */
function getNewGame(){
	fetch('GameListServlet?gameCategory=new')
		.then(res => res.json())
		.then(data => {
			jsonParserForTop(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 상단 최신게임 불러오기(버튼 클릭) */
function getNewGameEvent(){
	fetch('GameListServlet?gameCategory=new')
		.then(res => res.json())
		.then(data => {
			removeAllElements('.topTable td');
			removeAllElements('.topChart li');
			jsonParserForTop(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 상단 추천게임 불러오기 */
function getRecommendedGame(){
	fetch('GameListServlet?gameCategory=recommend')
		.then(res => res.json())
		.then(data => {
			removeAllElements('.topTable td');
			removeAllElements('.topChart li');
			jsonParserForTop(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 중단 태그별 게임 불러오기 (페이지 첫 로딩) */
function getTagGame(){
	fetch('GameTagListServlet')
		.then(res => res.json())
		.then(data => {
			jsonParserForMiddle(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 중단 태그별 게임 불러오기 (태그 클릭) */
function getTagGameEvent(tags){
	fetch('GameTagListServlet?tags='+tags)
		.then(res => res.json())
		.then(data => {
			console.log(data[0]);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 중단 태그 클릭 이벤트 */
function getCheckboxValue(){
	const query = 'input[name="tag"]:checked';
	const selectedEls = 
		document.querySelectorAll(query);
	
	let result = '';
	selectedEls.forEach((el) => {
		result += el.value + ',';
	});
	
	getTagGameEvent(result);
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