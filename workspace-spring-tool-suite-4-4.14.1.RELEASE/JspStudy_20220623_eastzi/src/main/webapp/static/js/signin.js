const inputItems = document.querySelectorAll("table input");
const submitButton = document.querySelector(".submit-button");
const signupButton = document.querySelector(".signup-button");
const maintainFlag = document.querySelector("#maintain-flag");

//로그인을 시도했을 때 값이 들어있는지 없는지 체크. 
//체크박스는 checked속성 사용. (on이거나 값이 없거나)
//쿠키 개인피씨, 로컬에 값들을 저장함. 
//maintainFlag.onchage = () => {
//	console.log(maintainFlag.vlaue);
//	console.log(maintainFlag.Checked);
//}

signupButton.onclick = () => {
	location.href = "/signup";
}

submitButton.onclick = () => {
	for(let i = 0; i < inputItems.length; i++) {
		if(isEmpty(inputItems[i].value)) {
			alert(
				(i == 0 ? "사용자 이름을" : "비밀번호를") + "입력해주세요."
			);
			return;
		}
	}
	
	submit();
}

function submit() {
	$.ajax({
		type: "post",
		url: "/signin",
		data: {
			username: inputItems[0].value,
			password: inputItems[1].value,
			maintain: maintainFlag.checked
		},
		dataType: "text",
		success: (response) => {
			if(response == "true") {
				alert("로그인 성공! 환영합니다.");
				location.replace("/index");
			}else{
				alert("사용자 정보를 확인해주세요.");
			}
		},
		error: errorMessage
	});
}

function errorMessage(request, status, error){
	alert("요청 실패");
	console.log(request.statuts); 
	console.log(request.responseText);
	console.log(error);
}

function isEmpty(str) {
	return str == "" || str == null || typeof str == undefined;
}