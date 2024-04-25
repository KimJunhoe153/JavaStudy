use gameshop;

SELECT * from games order by price desc limit 1;
SELECT * FROM games g1
WHERE g1.price = (SELECT MAX(g2.price) from games g2)")