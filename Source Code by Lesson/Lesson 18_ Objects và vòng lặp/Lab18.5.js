const populations = [1441, 99, 300, 7];

function percentageOfWorld1(population) {
    return population / 7900 * 100;
};

let percentages2 = [];
for (let i = 0; i < populations.length; i++){
    percentages2[i] = percentageOfWorld1(populations[i]);
}

console.log(percentages2);


