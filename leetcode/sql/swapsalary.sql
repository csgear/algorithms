
/* # leetcode.com 627 Swap Salary * /

UPDATE salary
    SET sex = (CASE WHEN sex = 'm' then 'f' ELSE 'm' END)