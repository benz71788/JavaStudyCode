drop sequence minfo_seq;
drop table minfo;

create sequence minfo_seq;

create table minfo(
	id number(2) primary key,
	name varchar2(20),
	age number(2),
	gender varchar2(4)
);

select * from minfo;

insert into minfo
values(minfo_seq.nextval, 'ȫ�浿', 21, '��');

select minfo_seq.currval from dual;

select * from minfo
where name like '%ȫ%';

select * from minfo
where gender like '%��%';

select *
from MINFO
where id = 12;