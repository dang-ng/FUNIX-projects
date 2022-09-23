// let markHeight = 1.69;
// let markWeight = 78;
// let johnHeight = 1.95;
// let johnWeight = 92;

let markHeight = 1.88;
let markWeight = 95;
let johnHeight = 1.76;
let johnWeight = 85;

let bmiMark = markWeight / (markHeight * markHeight);
let bmiJohn = johnWeight / (johnHeight * johnHeight);

let markHigherBMI = bmiMark > bmiJohn;
console.log(markHigherBMI);

if (bmiMark > bmiJohn) {
    console.log(`Mark's BMI ${bmiMark} is higher than John's ${bmiJohn}!`)
} else if (bmiJohn > bmiMark) {
    console.log(`John's BMI ${bmiJohn} is higher than Mark's ${bmiMark}!`)
} else {
    console.log(`2 BMIs are equal`);
}