window.onload = function(){
	// 글쓰기 버튼 클릭 이벤트 등록
	document.getElementById('write').addEventListener('click', function(){
		location.href = '../Board/writeBoard.jsp';
	}, false);

	// 카테고리 선택 이벤트 등록
	document.getElementById('boardCategory').addEventListener('change', getChangedBoardList, false);

	getBoardList();
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

/* 모든 요소 삭제 (데이터 갱신 시 기존 데이터 삭제 위함) */
function removeAllElements(query){
	let removeEles = document.querySelectorAll(query);
	for (let i=0; i<removeEles.length; i++){
		removeEles[i].parentNode.removeChild(removeEles[i]);
	}
}

/* 게시판 데이터 파싱 후 출력 */
function jsonParserForBoard(data){
	for (let i=0; i<data.length; i++){
		let jsonObj = JSON.parse(data[i]);
		insertElement('tr', 'boardList', '', 'id', 'board'+i);
		insertElement('td', 'board'+i, jsonObj.boardCategory);
		insertElement('td', 'board'+i, '<a href="../BoardDetailServlet?boardId='
			+ jsonObj.boardId + '">' + jsonObj.boardName + '</a>');
		insertElement('td', 'board'+i, jsonObj.mbrName);
		insertElement('td', 'board'+i, jsonObj.boardDate);
		insertElement('td', 'board'+i, jsonObj.boardCount);
		insertElement('td', 'board'+i, jsonObj.boardLiked);
	}
}

/* 게시판 글 목록 불러오기 (첫 로딩)*/
function getBoardList(){
	fetch('../BoardListServlet?boardKind=boardList')
		.then(res => res.json())
		.then(data => {
			jsonParserForBoard(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 게시판 글 목록 불러오기 (카테고리 선택 시)*/
function getChangedBoardList(){
	let target = document.getElementById('boardCategory');
	let selectedCategory = target.options[target.selectedIndex].value;

	fetch('../BoardListServlet?boardKind=boardList&&boardCategory='+selectedCategory)
		.then(res => res.json())
		.then(data => {
			removeAllElements('tr[id^="board"]');
			jsonParserForBoard(data);
		})
		.catch(err => {
			console.log(err);
		});
}

/* 게시판 검색 결과 불러오기 */
// function getBoardSearchList(){
// 	fetch('BoardListServlet?boardKind=boardSearchList')
// 		.then(res => res.json())
// 		.then(data => {
// 			console.log(data);
// 		})
// 		.catch(err => {
// 			console.log(err);
// 		});
// }