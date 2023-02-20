// const a = document.querySelector('#title');
// a.style.color='red';

// const b = document.querySelectorAll('.list');
// for(i = 0; i < b.length; i++) {
//     b[i].style.fontSize = '20px';
// }

// const li = document.createElement('li');
// document.querySelector('ul').append(li); 
// li.innerText='Hello World';

// li.setAttribute('class', 'list');

// const a = document.querySelector('li')
// a.classList.remove('list');
// a.classList.add('list');

// const b = document.querySelector('ul');
// console.log(b.childNodes[3].style.color='red');

// const content = document.querySelector('.hidecontent');
// const btn = document.querySelector('.btn');

// function displayContent() {
//     if(content.classList.contains('content')) {
//         content.classList.remove('content');
//     } else {
//         content.classList.add('content');
//     }
// }

// btn.addEventListener('click', displayContent);
// btn.addEventListener('click', function(e) {
//     console.log(e.target);
// },true);

// function reverse_geocode(lat,long) {
//     var response = Maps.newGeocoder().reverseGeocode(lat,long);
//     var address = response["results"][0]["formatted_address"];
//     console.log(lat, long);
//      console.log(address);
//   }

// function test() {
//     const lat = document.querySelector('#lat').value;
//     const long = document.querySelector('#long').value;
//     console.log(lat, long);
//     return reverse_geocode(lat,long);
// }
// document.querySelector('loc').addEventListener('click', reverse_geocode(lat,long))

// document.querySelector('#start').addEventListener('click', function(e) {
//     const target = e.target;
//     console.log(target.getAttribute('id') + " is clicked");
//     target.style.color = 'red';
// })

// const a = document.createElement('li');
// a.innerText = 'Hello World';
// a.setAttribute('id', '6');
// document.querySelector('#start').appendChild(a);

const number = document.querySelector('.number');
const words = document.querySelector('.words');
const btn = document.querySelector('.btn');

const numbers = [{number: 1, word: 'One'}, {number: 2, word: 'Two'}, {number: 3, word: 'Three'}, {number: 4, word: 'Four'}, {number: 5, word: 'Five'}, {number: 6, word: 'Six'}, {number: 7, word: 'Seven'}, {number: 8, word: 'Eight'}, {number: 9, word: 'Nine'}, {number: 10, word: 'Ten'}];

btn.addEventListener('click', function(e) {
    const random = Math.floor(Math.random() * numbers.length);
    number.innerText = numbers[random].number;
    words.innerText = numbers[random].word;
});