INSERT INTO
	major_mst(
	major_code,
	major_name,
	create_date,
	update_date
)
VALUE(
	0,
	'컴퓨터공학과',
	NOW(),
	NOW()
),
(
	0,
	'전자공학과',
	NOW(),
	NOW()
),
(
	0,
	'기계공학과',
	NOW(),
	NOW()
), 
(
	0,
	'화학공학과',
	NOW(),
	NOW()
), 
(
	0,
	'토목공학과',
	NOW(),
	NOW()
), 
(
	0,
	'국어국문학과',
	NOW(),
	NOW()
), 
(
	0,
	'영어영문학과',
	NOW(),
	NOW()
), 
(
	0,
	'유아교육학과',
	NOW(),
	NOW()
), 
(
	0,
	'경영학과',
	NOW(),
	NOW()
), 
(
	0,
	'정치외교학과',
	NOW(),
	NOW()
); 

SELECT 
	major_code,
	major_name,
	create_date,
	update_date
FROM 
	major_mst
WHERE
#	in() 
#	major_name IN('컴퓨터공학과', '정치외교학과', '기계공학과')
#	OR major_code = 7

#like %대상% => 검색창 구현시 사용
	major_name LIKE '%문%'

ORDER BY
	major_code desc;