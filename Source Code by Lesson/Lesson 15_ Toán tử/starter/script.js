const country = "Việt Nam";
const continent = "Asia";
let population = 99;

console.log(country);
console.log(continent);
console.log(population);

// Lab 15.1.
let isIsland = false;
let language;

console.log(isIsland);
console.log(language);

// Lab 15.2.
language = "Vietnamese";

console.log(language);

// country = "US"; //error

// Lab 15.3.
console.log(population / 2);

population += 1;
console.log(population);

console.log(population > 6);
console.log(population < 33);

let description = country + " and its " + population + " million people speak " + language;
console.log(description);

// Lab 15.4.
description = `${country} and its ${population} million people speak ${language}`;
console.log(description);

// Lab 15.5.

// population = 13;
// population = 130;

if (population > 33) {
    console.log(`${country}'s population is above average`);
} else {
    console.log(`${country}'s population is ${33 - population} million below average`);
}