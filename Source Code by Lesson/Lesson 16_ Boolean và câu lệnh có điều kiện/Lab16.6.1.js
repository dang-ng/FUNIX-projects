// let dolphinsScore1 = 96;
// let dolphinsScore2 = 108;
// let dolphinsScore3 = 89;
// let koalasScore1 = 88;
// let koalasScore2 = 91;
// let koalasScore3 = 110;

// let dolphinsScore1 = 97;
// let dolphinsScore2 = 112;
// let dolphinsScore3 = 101;
// let koalasScore1 = 109;
// let koalasScore2 = 95;
// let koalasScore3 = 123;

let dolphinsScore1 = 97;
let dolphinsScore2 = 112;
let dolphinsScore3 = 101;
let koalasScore1 = 109;
let koalasScore2 = 95;
let koalasScore3 = 106;

let dolphinsAverage = (dolphinsScore1 + dolphinsScore2 + dolphinsScore3) / 3;
let koalasAverage = (koalasScore1 + koalasScore2 + koalasScore3) / 3;

if (dolphinsAverage > koalasAverage && dolphinsAverage >= 100) {
    console.log("dolphins wins");
} else if (koalasAverage > dolphinsAverage && koalasAverage >= 100) {
    console.log("koalas wins");
} else if (koalasAverage === dolphinsAverage && koalasAverage >= 100) {
    console.log("draw");
} else console.log("no winner");
