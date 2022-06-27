const signupBtn = document.querySelectorAll("nav ul li");

//selectorall => 배열
signupBtn[0].onclick = () => {
	location.href = "/signup";
}