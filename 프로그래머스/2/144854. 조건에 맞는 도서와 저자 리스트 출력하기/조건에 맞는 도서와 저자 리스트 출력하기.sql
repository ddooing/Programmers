
SELECT BOOK_ID,AUTHOR_NAME,
        TO_CHAR(PUBLISHED_DATE,'yyyy-mm-dd') AS PUBLISHED_DATE
FROM BOOK B
JOIN AUTHOR A ON B.AUTHOR_ID= A.AUTHOR_ID
WHERE CATEGORY='경제'
ORDER BY PUBLISHED_DATE ASC;