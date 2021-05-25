window.onload = function(){
	// 글쓰기 버튼 클릭 이벤트 등록
	document.getElementById('write').addEventListener('click', function(){
		location.href = '../Board/writeBoard.jsp';
	}, false);

	getBoardList();
};

/* 게시판 글 목록 불러오기 (첫 로딩)*/
function getBoardList(){
	fetch('../BoardListServlet?boardKind=boardList&&boardCategory=common')
		.then(res => res.json())
		.then(data => {
			console.log(data);
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