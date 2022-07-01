INSERT INTO 
	user_mst
VALUES(
	0,
	'김준일',
	'asdf@naver.com',
	'junil',
	'1234',
	'ROLE_USER',
	'google',
	NOW(),
	NOW()
);

/*
INSERT INTO 
	user_dtl( 
		user_code,
		create_date,
		update_date
	)
VALUES(
	0,
	NOW(),
	NOW()
)
*/

DELETE
FROM
	user_mst
WHERE
	user_code = 1;