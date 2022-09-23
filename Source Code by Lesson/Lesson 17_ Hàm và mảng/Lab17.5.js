const populations = [1441, 99, 300, 7];

console.log(populations);
console.log(populations.length === 4);

function percentageOfWorld1(population) {
    return population / 7900 * 100;
};

let percentages = [
    percentageOfWorld1(populations[0]),
    percentageOfWorld1(populations[1]),
    percentageOfWorld1(populations[2]),
    percentageOfWorld1(populations[3])
];

console.log(percentages);


