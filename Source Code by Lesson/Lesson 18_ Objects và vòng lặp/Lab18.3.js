const myCountry = {
    country: 'Vietnam',
    capital: 'Hanoi',
    language: 'vietnamese',
    population: 99,
    neighbours: ['Laos', 'Campuchia', 'Thailand'],
    describe: function() {
        console.log(`${this.country} has ${this.population} million ${this.language}-speaking people, ${this.neighbours.length} neighbouring countries and a capital called ${this.capital}.`)
    },
    checkIsland: function () {
        this.isIsland = this.neighbours.length === 0 ? true : false;
        return this.isIsland;
    }
}

myCountry.describe();
myCountry.checkIsland();
console.log(myCountry.isIsland);