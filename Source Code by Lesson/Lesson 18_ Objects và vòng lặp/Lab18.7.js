const populations = [1441, 99, 300, 7];

function percentageOfWorld1(population) {
    return population / 7900 * 100;
}

let percentages3 = [];
let i = 0;
while (i < populations.length) {
    percentages3[i] = percentageOfWorld1(populations[i]);
    i++;
}

console.log(percentages3);


