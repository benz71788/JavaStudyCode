drop sequence gradecard_seq;

create sequence gradecard_seq
	start with 1
	increment by 1;

select gradecard_seq.currval from dual;

select * from gradecard;

insert into gradecard(no, name, kor, eng, mat)
values(gradecard_seq.nextval, '¿Ãº∫»Ò', 100, 100, 100);