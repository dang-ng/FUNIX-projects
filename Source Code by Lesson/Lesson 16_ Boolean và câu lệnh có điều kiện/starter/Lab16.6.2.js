// let bill = 275;
// let bill = 40;
let bill = 430;

let tipPercent = (bill >= 50 && bill <= 300) ? 0.15 : 0.2;
let tip = tipPercent * bill;

console.log(tipPercent)

console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${bill+tip}`);