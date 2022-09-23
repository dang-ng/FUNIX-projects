const mark = {
    fullName: 'Mark Miller',
    mass: 78,
    height: 1.69,
    calcBMI: function () {
        this.bmi = this.mass / (this.height * this.height);
        return this.bmi;
    }
}

const john = {
    fullName: 'John Smith',
    mass: 92,
    height: 1.95,
    calcBMI: function () {
        this.bmi = this.mass / (this.height * this.height);
        return this.bmi;
    }
}

if (john.calcBMI() > mark.calcBMI()) {
    console.log(`John's BMI (${john.calcBMI()}) is higher than Mark's (${mark.calcBMI()})!`);
} else if (john.calcBMI() < mark.calcBMI()) {
    console.log(`Mark's BMI (${mark.calcBMI()}) is higher than John's (${john.calcBMI()})!`);
}