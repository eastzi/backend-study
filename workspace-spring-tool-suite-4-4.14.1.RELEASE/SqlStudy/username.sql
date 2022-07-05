/*===========================================
		findUserByUsername
=============================================*/

SELECT 
	um.user_code,
	um.name,
	um.email,
	um.username,
	um.password,
	um.roles,
	um.provider,
	ud.user_profile_img,
	ud.user_address,
	ud.user_phone,
	ud.user_gender
FROM
	user_mst um
	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)
WHERE 
	um.username = 'aaaaa';