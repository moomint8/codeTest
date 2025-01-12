SELECT AO.ANIMAL_ID,
       AO.NAME
  FROM ANIMAL_OUTS AO LEFT JOIN ANIMAL_INS AI
    ON AO.ANIMAL_ID = AI.ANIMAL_ID
 WHERE AO.DATETIME < AI.DATETIME
 ORDER BY AI.DATETIME;