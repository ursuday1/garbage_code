function clickme()
{
	let words= prompt("Select a option for output\nEither ok or cancel");
	switch(words){
		case "ok":
		words="is it really okay?"
		break;
		default:
		words="cool";
	}
	document.getElementById("test").innerHTML= words;
}
function clickme21()
{
	alert(5+2);
}
function clickme22()
{
	try
	{
		let x=5;
		let y=10;
		let z=15;
		z+=x;
		document.getElementById("test").innerHTML=z;
	}
	catch(err)
	{
		document.getElementById("test2").innerHTML= err;
	}
}
function clickme22()
{
	const man = {firstname:"urs", lastname:"uday", age:20, eyecolor:"black"};
	document.getElementById("test").innerHTML= "My name is " + man.lastname + " and my age is " + man.age;	
}
function clickme2() {
	const person= {
		firstname: "urs", lastname: "uday", age: 20, fullname: function() {return this.firstname + " " + this.lastname;}
	};
	document.getElementById("test").innerHTML= person.fullname();
}
function replace()
{
	let text= document.getElementById("replace").innerHTML;
	document.getElementById("replace").innerHTML= text.replace(/NERD/i,"jerk");
}
function str()
{
	try {
		let a= document.getElementById("str").innerHTML;
		document.getElementById("test3").innerHTML= a.lastIndexOf("nerd",39);
	}
	catch(err){
		document.getElementById("test4").innerHTML= err.message;
	}
}
// {
// 	let firstname= "urs";
// 	let lastname= "uday";
// 	let fullname= `Welcome ${firstname} ${lastname}`;
// 	document.getElementById("test5").innerHTML= fullname;
// }

	// const cars = ["Volvo", "Toyota", "Tesla", "Tata"];
	// let len = cars.length;

	// let text = "<ul>";
	// for(let i = 0; i < len; i++) {
	// 	text += "<li>" + cars[i] + "</li>";
	// }
	// text += "</ul>";
	// document.getElementById("test6").innerHTML = text;

try{
	const cars = ["Volvo", "Toyota", "Tesla", "Tata"];
	const mobiles = ["Xiaomi", "Samsung", "Poco", "Realme"];
	const alldevices = cars.concat(mobiles);
	let text = "<ul>";
	alldevices.forEach(all);
	text += "</ul>";
	function all(value)
	{
		text += "<li>" + value + "</li>";
	}
	document.getElementById("test7").innerHTML = text;
}
catch(err){}
try {
	const num = [1,2,3,4,5];
	document.getElementById("test8").innerHTML= num;
	function gen_rand() {
		for (let i = num.length -1; i > 0; i--) {
			let j = Math.floor(Math.random()*i);
			let k = num[i];
			num[i] = num[j];
			num[j] = k;
		}
		document.getElementById("test8").innerHTML= num;
	}
}
	catch(err) {}

try {
	function find() {
		const num = [1,2,3,4,5];
		document.getElementById("test9").innerHTML= finding_big(num);
		function finding_big(arr) {
			let len = num.length;
			let max = Infinity;
			while(len--) {
				if(arr[len] < max){
					max = arr[len];
				}
			}
			return max;
		}
	}
}
catch(err) {
}
try {
	
	const mobiles = [{type: "Xiaomi", year: 2016}, {type:"Samsung", year: 2001}, {type:"Nokia", year: 2005}];
	displayMobiles();
	function sorting() {
		mobiles.sort(function(a,b) {
			let x= a.type.toLowerCase();
			let y= b.type.toLowerCase();
			if(x < y) {return -1;}
			if(x > y) {return 1;}
			else return 0;
		})
		displayMobiles();
	}
	function displayMobiles() {
		document.getElementById("test10").innerHTML = 
		mobiles[0].type + " " + mobiles[0].year + "<br>" +
		mobiles[1].type + " " + mobiles[1].year + "<br>" +
		mobiles[2].type + " " + mobiles[2].year + "<br>"
	}
}
catch(err) {}

function disp() {
	const num= [1,2,3,4,5];
	let txt="";
	num.forEach(disp_num);
	document.getElementById("test11").innerHTML= txt;
	function disp_num(value) {
		txt += value + " <br>";
	}
}
function mape() {
	const num1 = [1,2,3,4,5];
	const num2 = num1.filter(fun);
	document.getElementById("test12").innerHTML= num2;
	function fun(value) {
		return value > 2;
	}
}