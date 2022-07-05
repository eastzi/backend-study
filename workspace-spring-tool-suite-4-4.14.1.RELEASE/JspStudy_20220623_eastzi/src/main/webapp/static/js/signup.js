const usernameInput = document.querySelector(".username-input");
const usernameCheckMsg = document.querySelector(".username-check-msg");

let signupFlag = false;

usernameInput.onblur = () => {
	let username = usernameInput.value;
	//자바스크립트 {} => 객체
	//방법2
	/*const option = {
		type: "get",
		//? 앞까지가 서블릿의 맵핑주소
		url: `/check/username?username=${username}`,
		dataType: "text", //응답받을 때의 데이터 형태(json사용 예정})
		success: (response) => {
			alert("요청 후 응답 성공: " + response);
		},
		error: (request, status, error) => { //여기 status는 거의 자리채움용
			alert("요청 실패");
			console.log(request.statuts); //주사용 status
			console.log(request.responseText);
			console.log(error);
		}
	}
	
	$.ajax(option);
	*/
	
	//방법1
	$.ajax({
		type: "get",
		//? 앞까지가 서블릿의 맵핑주소
		url: `/check/username?username=${username}`,
		dataType: "text", //응답받을 때의 데이터 형태(json사용 예정})
		success: (response) => {
			if(response == "true"){
				signupFlag = false;
				usernameCheckMsg.innerHTML = `<td colspan = "2">${username}은(는) 이미 존재하는 사용자이름 입니다.</td>`;
			}else{
				signupFlag = true;
				usernameCheckMsg.innerHTML = `<td colspan = "2">${username}은(는) 가입할 수 있는 사용자이름 입니다.</td>`;
			}
		},
		error: (request, status, error) => { //여기 status는 거의 자리채움용
			alert("요청 실패");
			console.log(request.statuts); //주사용 status
			console.log(request.responseText);
			console.log(error);
		}
	});
}