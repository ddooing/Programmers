-- 코드를 입력하세요
SELECT BOOK_ID ,DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK 
WHERE CATEGORY='인문' AND DATE_FORMAT(PUBLISHED_DATE,'%Y')=2021 
ORDER BY PUBLISHED_DATE ASC;


-- DATE_FORMAT 형식 변환 