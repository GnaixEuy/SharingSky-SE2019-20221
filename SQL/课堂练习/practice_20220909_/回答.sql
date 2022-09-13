-- 第一题
SELECT A.ENAME AS '员工姓名', B.ENAME AS '所属经理名字'
FROM EMP A,
     EMP B
WHERE A.MGR = B.EMPNO;

-- 第二题
SELECT *
FROM EMP
WHERE EMP.SAL > (SELECT AVG(EMP.SAL) FROM EMP);

-- 第三题
SELECT *
FROM EMP
WHERE EMP.JOB IN (SELECT EMP.JOB FROM EMP WHERE EMP.ENAME = 'SCOTT')
  AND EMP.ENAME != 'SCOTT';

-- 第四题
SELECT EMP.ENAME, DEPT.DNAME, EMP.SAL
FROM EMP,
     DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

-- 第五题
SELECT *
FROM EMP
         LEFT JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;

-- 第六题
SET sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
SELECT EMP.JOB, MIN(EMP.SAL) AS '最低工资'
FROM EMP
GROUP BY EMP.JOB;