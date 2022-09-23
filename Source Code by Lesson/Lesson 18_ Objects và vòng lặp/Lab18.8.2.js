const bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];

let tips = [];
let totals = [];

calcTip = (bill) => (bill >= 50) && (bill <= 300) ? bill * 0.15 : bill * 0.2;

for (let i = 0; i < bills.length; i++){
    tips[i] = calcTip(bills[i]);
    totals[i] = tips[i] + bills[i];
}

console.log(tips);
console.log(totals);

// Bonus

function calcAverage(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum / arr.length;
}

console.log(calcAverage(totals));
