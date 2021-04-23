SHOW USER;

create table game (
game_no varchar2(10) not null,
game_name varchar2(100) not null,
game_image varchar2(100),
game_price number(10),
game_content varchar2(300),
game_category varchar2(100),
CONSTRAINT pk_game PRIMARY KEY (game_no));
-- game 테이블 생성
-- drop table game CASCADE CONSTRAINTS;

create table game_tag (
game_no varchar2(10) not null,
tag_temp char(1) not null,
CONSTRAINT fk_game FOREIGN KEY(game_no) REFERENCES game(game_no) ON DELETE CASCADE);
-- game_tag 테이블 생성
-- drop table game_tag CASCADE CONSTRAINTS;

create table member (
mbr_id varchar2(24) not null,
mbr_pw varchar2(24) not null,
mbr_name varchar2(36) not null,
mbr_email varchar2(24) not null,
mbr_regdate date,
CONSTRAINT pk_member PRIMARY KEY (mbr_id), CHECK(LENGTH(mbr_pw) > 6)
);
-- member 테이블 생성
-- drop table member CASCADE CONSTRAINTS;

create table member_tag (
mbr_id varchar2(24) not null,
tag_temp char(1) not null,
CONSTRAINT fk_member FOREIGN KEY(mbr_id) REFERENCES member(mbr_id) ON DELETE CASCADE);
-- member_tag 테이블 생성
-- drop table member_tag CASCADE CONSTRAINTS;

create table rate (
game_no varchar2(10) not null,
game_score number(10),
rate_count number(10),
CONSTRAINT fk_rate FOREIGN KEY(game_no) REFERENCES game(game_no) ON DELETE CASCADE);
-- rate 테이블 생성
-- drop table rate CASCADE CONSTRAINTS;

create table board (
board_id varchar2(10) not null,
mbr_id varchar2(24) not null,
board_category varchar2(10) not null,
board_name varchar2(100) not null,
board_content varchar2(300) not null,
board_count number,
board_date date,
CONSTRAINT pk_board PRIMARY KEY(board_id),
CONSTRAINT fk_board FOREIGN KEY(mbr_id) REFERENCES member(mbr_id) ON DELETE CASCADE);
-- board 테이블 생성
-- drop table board CASCADE CONSTRAINTS;

create table board_reply (
reply_id varchar2(10) not null,
board_id varchar2(10) not null,
mbr_id varchar2(24) not null,
reply_content varchar2(300) not null,
reply_recommend number,
reply_date date,
CONSTRAINT pk_board_reply PRIMARY KEY(reply_id),
CONSTRAINT fk_board_reply FOREIGN KEY(mbr_id) REFERENCES member(mbr_id) ON DELETE CASCADE);
-- board_reply 테이블 생성
-- drop table board_reply CASCADE CONSTRAINTS;

create table game_reply (
reply_id varchar2(10) not null,
mbr_id varchar2(24) not null,
game_no varchar2(10) not null,
reply_content varchar2(300) not null,
reply_recommend number,
game_score number,
reply_date date,
CONSTRAINT pk_game_reply PRIMARY KEY(reply_id),
CONSTRAINT fk_game_reply FOREIGN KEY(mbr_id) REFERENCES member(mbr_id) ON DELETE CASCADE);
-- game_reply 테이블 생성
-- drop table game_reply CASCADE CONSTRAINTS;

create table news (
);
--
