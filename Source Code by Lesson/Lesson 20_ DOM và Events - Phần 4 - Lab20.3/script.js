'use strict';

let secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highScore = 0;
let win = false;

const displayMessage = function (message) {
    document.querySelector('.message').textContent = message;
}

document.querySelector('.check').addEventListener('click', function () {
    const guess = Number(document.querySelector('.guess').value);
        if (win || score == 0) {
            displayMessage('Hit play button to play again!')
        } else if (!guess) {
            displayMessage('No Number!');
        } else if (guess === secretNumber) {
            displayMessage('Correct Number! Congratulations');
            document.querySelector('body').style.backgroundColor = '#60b347';
            document.querySelector('.number').style.width = '30rem';
            document.querySelector('.number').textContent = guess;
            win = true;
            if (score > highScore) {
                highScore = score;
                document.querySelector('.highscore').textContent = highScore;
            }
        } else if (score > 1) {
                displayMessage(guess < secretNumber ? 'Too low!' : 'Too high!');
                score--;
                document.querySelector('.score').textContent = score;
        } else {
            displayMessage('You lost the game! Hit play button to play again!');
            score = 0;
            document.querySelector('.score').textContent = 0;
        }
})

document.querySelector('.again').addEventListener('click', function () {
    win = false;
    score = 20;
    secretNumber = Math.trunc(Math.random() * 20) + 1;
    displayMessage('Start guess...');
    document.querySelector('.score').textContent = score;
    document.querySelector('.number').textContent = '?';
    document.querySelector('.guess').value = '';
    document.querySelector('body').style.backgroundColor = '#222';
    document.querySelector('.number').style.width = '15rem';
})