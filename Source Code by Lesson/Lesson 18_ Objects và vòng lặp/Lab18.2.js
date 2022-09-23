const myCountry = {
    country: 'Vietnam',
    capital: 'Hanoi',
    language: 'vietnamese',
    population: 99,
    neighbours: ['Laos', 'Campuchia', 'Thailand']
}

console.log(myCountry);

let str = `${myCountry.country} has ${myCountry.population} million ${myCountry.language}-speaking people, ${myCountry.neighbours.length} neighbouring countries and a capital called ${myCountry.capital}.`;

console.log(str);

myCountry.population += 2;
console.log(myCountry.population);

myCountry['population'] -= 2;
console.log(myCountry['population']);