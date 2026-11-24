const prompt = require("prompt-sync")();

let secret = 45
let guess = prompt("Guess the number: ")
while (secret != guess){
    guess = prompt("Wrong! Guess the number: ")
}
