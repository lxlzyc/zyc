
//1.验证用户名和密码： 正确格式：/[A-Z][a-z]_[0-9]/组成,并且第一个字必须为字母6~16位；
var regName = /^[a-zA-Z]\w{5,15}$/;
//2.验证电话号码： 正确格式：xxx/xxxx-xxxxxxx/xxxxxxxx；
var regTelNum = /^(\\d{3,4}-)\\d{7,8}$/;
// 3.验证手机号码：
var regPhoneNum = /^1[3|4|5|7|8][0-9]\\d{8}$/;
// 4.验证身份证号（15位或18位数字）：
var regChinaIDCard = /\\d{14}[[0-9],0-9xX]/;
// 5.验证Email地址：
var regEmailAdd = (/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/);
// 6.只能输入由数字和26个英文字母组成的字符串：
var regNomarlStr = /^[A-Za-z0-9]+$/;
// 7.整数或者小数：
var regIsDoubleNum = /^[0-9]+([.][0-9]+){0,1}$/;
//8.只能输入数字
var regIsAllNum =/^[0-9]*$/;

document.getElementById("submitBtn").onclick = function clickSubmit(){
	if(!document.getElementById("empNo").value){
		alert("请输入编号");
		return false;
	}
	//test 验证是否符合正则表达式 返回true或false
	if(!regIsAllNum.test(document.getElementById("empNo").value)){
		alert("请输入正确的编号");
	}
	//正则表达式方法exec测试给定的字符串是否满足正则表达式，返回匹配到的字符串，
	//如果没有匹配的则返回null，和test基本一致，如果需要获取匹配的各个子字符串，可以使用下标的方式，把上边的test的例子可以改写如下
	//var result=  re.exec(text);
	
	//match其实是字符串的方法，但参数确是一个正则表达式
	//var result= text.match(re);
	
}

function hello(){
	alert("hello");
}

function ByeBye(){
	alert("byebye");
}

