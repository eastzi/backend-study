#join

#left outer join
SELECT #순서 3
	sm.student_name AS '이름',
	sm.student_year AS '학년',
	sm.school_code,
	scm.school_name,
	sm.major_code,
	mj.major_name
FROM #순서 1
	student_mst sm 
	left outer join school_mst scm ON(scm.school_code = sm.school_code)
	LEFT OUTER JOIN major_mst mj ON(mj.major_code = sm.major_code)
WHERE #순서 2
	#sm.school_code = 1; #sm 자리가 가지고있는 코드를 적어야함.(값이 중복될때)
	mj.major_name LIKE '%공학%'
	OR scm.school_name IN('부산대학교', '부경대학교', '경성대학교')
ORDER BY 
	sm.major_code;

# major_name에 공학을 포함하고 있거나 
# school_name이 부산대학교, 부경대학교, 경성대학교 이면
# 결과가 출력되도록 하라.
	

#서브쿼리(하위쿼리)
# 1) where절에서 사용하는 서브쿼리 
SELECT
	*
FROM
	student_mst
WHERE
	school_code = (SELECT	 
							school_code 
						FROM 
							school_mst
						WHERE
							school_name = '부산대학교');

# 2) select 부분에서 사용하는 서브쿼리 
SELECT 
	student_code,
	student_name
	(select
		COUNT(*) #전체갯수를 계산하기위해 필요한 부분
	FROM
		student_mst) AS student_count
FROM
	student_mst
WHERE
	student_code = 1;
	
# 3) from 위치에 사용하는 서브쿼리 
SELECT 
	sm.student_name,
	sm.school_code,
	scm.school_name
FROM
	(SELECT
		*
	FROM
		student_mst
	WHERE
		school_code = (SELECT	 
								school_code 
							FROM 
								school_mst
							WHERE
								school_name = '부산대학교')) sm
	LEFT OUTER JOIN school_mst scm ON(scm.school_code = sm.school_code);


#limit 
SELECT
	*
FROM
	student_mst
LIMIT 6, 3; 


#update 
UPDATE 
	student_mst 
SET 
	student_year = student_year + 1 #여기서 조건이 끝나면 모든 학년이 3으로 변경되니
WHERE 
	student_code = 1; #where에서 추가조건을 줘야함. 

UPDATE
	major_mst
SET
	major_name = '중어중문학과'
WHERE
	major_name = '영어영문학과';

SELECT
	*
FROM
	major_mst;

#delete
DELETE
FROM
	student_mst
WHERE
	student_code = 10;
	
SELECT
	*
FROM 
	student_mst;













