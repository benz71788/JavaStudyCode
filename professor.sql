DROP TABLE PROFESSOR;
CREATE TABLE PROFESSOR(
	PROFNO NUMBER(5, 0) PRIMARY KEY,
	NAME VARCHAR2(10) NOT NULL,
	ENAME VARCHAR2(20) NOT NULL,
	POSITION VARCHAR2(20) NOT NULL,
	SAL NUMBER(4, 0) NOT NULL,
	HIREDATE DATE NOT NULL,
	AGE NUMBER(3, 0) NOT NULL,
	DEPTNO NUMBER(3, 0) NOT NULL
);

SELECT * FROM PROFESSOR;

SELECT P.NAME, P.PROFNO, D.DNAME, P.POSITION
FROM PROFESSOR P INNER JOIN DEPARTMENT D
ON P.DEPTNO = D.DEPTNO;
