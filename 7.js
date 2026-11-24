const prompt = require("prompt-sync")();

let userInput = prompt("Input a string: ")
let reversedString = ""
for (let character of userInput) {
    reversedString = character + reversedString
}
console.log(reversedString)
