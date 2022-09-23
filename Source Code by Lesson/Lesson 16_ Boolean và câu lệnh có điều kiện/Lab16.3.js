let language = prompt('ngôn ngữ');
let population = prompt('dân số');
let isIsland = prompt('phải đảo quốc không');

if (language === "English" && population < 50 && isIsland) {
    console.log('You should live in Portugal :)');
} else console.log('Portugal does not meet your criteria : (');