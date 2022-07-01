#CRUD

#Create(insert)

INSERT INTO
	school_mst
VALUES(
	0, 
	'신라대학교', 
	NOW(), 
	NOW()
),
(
	0, 
	'영산대학교', 
	NOW(), 
	NOW()
);

#Read(select)
#테이블 데이터 전체 조회
SELECT 
	school_code, 
	school_name, 
	create_date, 
	update_date 
FROM 
	school_mst
WHERE 
	school_name = '부산대학교'
or school_code = 2
ORDER BY
	school_code desc;
















