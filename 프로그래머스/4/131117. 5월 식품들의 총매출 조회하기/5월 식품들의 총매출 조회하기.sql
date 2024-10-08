SELECT F.PRODUCT_ID, F.PRODUCT_NAME, SUM(O.AMOUNT * F.PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT F
JOIN FOOD_ORDER O ON F.PRODUCT_ID = O.PRODUCT_ID
WHERE O.PRODUCE_DATE LIKE '2022-05%'
GROUP BY PRODUCT_ID
ORDER BY TOTAL_SALES DESC, F.PRODUCT_ID;