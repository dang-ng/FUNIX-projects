// let dolphinsScore1 = 44;
// let dolphinsScore2 = 23;
// let dolphinsScore3 = 71;
// let koalasScore1 = 65;
// let koalasScore2 = 54;
// let koalasScore3 = 49;

let dolphinsScore1 = 85;
let dolphinsScore2 = 54;
let dolphinsScore3 = 41;
let koalasScore1 = 23;
let koalasScore2 = 34;
let koalasScore3 = 27;

calcAverage = (score1, score2, score3) => (score1 + score2 + score3) / 3;

let dolphinsAverage = calcAverage(dolphinsScore1, dolphinsScore2, dolphinsScore3);
let koalasAverage = calcAverage(koalasScore1, koalasScore2, koalasScore3);

function checkWinner(dolphinsAverage, koalasAverage) {
    if (dolphinsAverage >= (koalasAverage * 2)) {
        console.log(`Dolphins win (${dolphinsAverage} vs. ${koalasAverage})`);
    } else if (koalasAverage >= (dolphinsAverage * 2)) {
        console.log(`Koalas win (${koalasAverage} vs. ${dolphinsAverage})`);
    } else console.log('No winnder');
}

checkWinner(dolphinsAverage, koalasAverage);

