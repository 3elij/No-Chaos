const prompt = require("prompt-sync")();

number = prompt("Input a 13 digit number: ")
let total = 0
for (let character of number){
    let counter = 0
    if (counter%2 == 0){
        total = total + counter
    }
    else{
        total = total + (3*counter)
    }
}
overallTotal = 10-(total)%10
if (overallTotal == (number%10)){
    console.log("Valid input")
}
else{
    console.log("Invalid input")
}
