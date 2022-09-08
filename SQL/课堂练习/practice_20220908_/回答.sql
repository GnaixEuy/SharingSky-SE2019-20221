-- 第一题
INSERT INTO zretc_homework.`user` (`user`.userName, `user`.address, `user`.sex, `user`.salary)
    VALUE
    ('刘亦菲', '湖里区', '女', 10000);

-- 	第二题
UPDATE `user`
SET `user`.salary = 20000
WHERE `user`.userId = 1011;

-- 第三题
DELETE
FROM `user`
WHERE `user`.userId = 1011;

-- 第四题
SELECT *
FROM `user`
WHERE `user`.salary > 10000;

-- 第五题
SELECT `user`.sex,
       COUNT(`user`.sex) AS 人数
FROM `user`
GROUP BY `user`.sex;

-- 第六题
SELECT *
FROM `user`
WHERE `user`.salary > 20000
  AND `user`.address IN (SELECT `user`.address WHERE `user`.address = '思明区' OR `user`.address = '湖里区');

-- 第七题
SET sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
SELECT `user`.userId,
       `user`.userName,
       `user`.sex,
       `user`.address,
       MAX(salary) AS salary
FROM `user`
GROUP BY `user`.sex;