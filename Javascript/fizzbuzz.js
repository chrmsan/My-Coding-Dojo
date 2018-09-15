function fizzbuzz() {
    var randomNum = Math.floor(Math.random() * 100) + 1;

    if ((randomNum % 3 === 0) && (randomNum % 5 === 0)) {
        return randomNum + " - FizzBuzz";
    } else if (randomNum % 3 === 0) {
        return randomNum + " - Fizz";
    } else if (randomNum % 5 === 0) {
        return randomNum + " - Buzz";
    } else {
        return randomNum;
    }
}