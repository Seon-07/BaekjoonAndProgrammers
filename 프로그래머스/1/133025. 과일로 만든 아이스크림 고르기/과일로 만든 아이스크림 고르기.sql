-- 코드를 입력하세요
SELECT FLAVOR
FROM FIRST_HALF
WHERE TOTAL_ORDER > 3000
AND flavor in (select flavor from icecream_info where ingredient_type = 'fruit_based')
ORDER BY TOTAL_ORDER desc;