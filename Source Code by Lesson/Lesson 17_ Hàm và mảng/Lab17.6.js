let neighbours = ['Laos', 'Campuchia', 'Thailand'];
console.log(neighbours);

neighbours.push('Utopia');
console.log(neighbours);

neighbours.pop('Utopia');
console.log(neighbours);

if (!neighbours.includes('Germany')) {
    console.log('Probably not a central European country :D');
}

neighbours[neighbours.indexOf('Laos')] = 'Republic of Laos';
console.log(neighbours);


