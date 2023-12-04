SELECT U.USER_ID, U.NICKNAME, B.TOTAL_SALES
FROM (SELECT WRITER_ID, SUM(PRICE) AS TOTAL_SALES
      FROM USED_GOODS_BOARD
      WHERE STATUS = 'DONE'
      GROUP BY WRITER_ID) B
         JOIN USED_GOODS_USER U
              ON (B.WRITER_ID = U.USER_ID)
WHERE B.TOTAL_SALES >= 700000
ORDER BY B.TOTAL_SALES ASC;