function percentageOfWorld1(population) {
    return population / 7900 * 100;
};

let describePopulation = (country, population) => `${country} has ${population} million people, which is about ${percentageOfWorld1(population)}% of the world`;

console.log(describePopulation('China', 1441));
console.log(describePopulation('Vietnam', 99));
console.log(describePopulation('US', 300));
