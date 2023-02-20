let pausePlay = document.querySelector('#pausePlay');
let reset = document.querySelector('#reset');
let startStop = document.querySelector('#startStop');

let milliseconds = 0;
let seconds = 0;
let minutes = 0;
let hours = 0;
let stats = 'stopped';
let timer = null;

// Extra 0's
let milliZero = 0;
let secZero = 0;
let minZero = 0;
let hourZero = 0;


function stopWatch() {
    
    milliseconds++;
    if (milliseconds === 100) {
        milliseconds = 0;
        seconds++;
    }
    else if (seconds === 60) {
        seconds = 0;
        minutes++;
    } else if (minutes === 60) {
        minutes = 0;
        hours++;
    }   else if (hours === 24) {
        hours = 0;
    }
    if (milliseconds < 10) {
        milliZero = "0" + milliseconds.toString();
    } else {
        milliZero = milliseconds;
    }
    if (seconds < 10) {
        secZero = "0" + seconds.toString();
    } else {
        secZero = seconds;
    }
    if (minutes < 10) {
        minZero = "0" + minutes.toString();
    } else {
        minZero = minutes;
    }
    if (hours < 10) {
        hourZero = "0" + hours.toString();
    } else {
        hourZero = hours;
    }
    console.log(seconds.toString());
    document.querySelector('#countdown').innerHTML = `${hourZero}:${minZero}:${secZero}:${milliZero}`;
}

function count() {
    if (stats === 'stopped') {
        timer = window.setInterval(stopWatch, 10);
        stats = 'started';
        pausePlay.classList.remove("fa-play");
        pausePlay.classList.add("fa-pause");
    }else {
        window.clearInterval(timer);
        stats = 'stopped';
        pausePlay.classList.remove("fa-pause");
        pausePlay.classList.add("fa-play");
    }
}  

startStop.addEventListener('click', count);
reset.addEventListener('click', function() {
    window.clearInterval(timer);
    milliseconds = 0;
    seconds = 0;
    minutes = 0;
    hours = 0;
    document.querySelector('#countdown').innerHTML = "00:00:00:00";
    stats = 'stopped';
    pausePlay.classList.remove("fa-pause");
    pausePlay.classList.add("fa-play");
});
