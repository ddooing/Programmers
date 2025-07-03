-- 같은 맛의 아이스크림이라도 다른 출하 번호를 갖게 됩니다.
-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 
-- SUM(J.TOTAL_ORDER)+ SUM(F.TOTAL_ORDER)
-- 큰 순서대로 상위 3개의 맛을 조회
-- MYSQL LIMIT 3;
-- ORACLE 에선 서브 쿼리를 통해 미리 정렬 후, ROWNUM 
-- 주의 ' = '은 안됨, 데이터를 하나씩 읽어오기 때문에 
SELECT FLAVOR
FROM ( SELECT F.FLAVOR
        FROM FIRST_HALF F JOIN JULY J ON F.FLAVOR =J.FLAVOR
      GROUP BY F.FLAVOR
      ORDER BY SUM(J.TOTAL_ORDER + F.TOTAL_ORDER) DESC
        )
WHERE ROWNUM<=3;


