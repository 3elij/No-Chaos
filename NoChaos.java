import java.util.Scanner;

public class NoChaos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for (int i = 100; i <= 999; i++) {
        //     int digits = i % 10;
        //     int digits2 = (i / 10) % 10;
        //     int digits3 = i / 100;
        //     if (digits*digits*digits + digits2*digits2*digits2 + digits3*digits3*digits3 == i) {
        //         System.out.println(i);
        //     }
        // }

        // System.out.print("Input a number(-1 to stop): ");
        // int userInput = input.nextInt();
        // int counter = 1;
        // int total = 0;
        // while (userInput != -1) {
        //     total += userInput;
        //     double average = (double) total / counter;
        //     counter++;
        //     System.out.println("The average is " + average);
        //     System.out.print("Input a number(-1 to stop): ");
        //     userInput = input.nextInt();
        // }

        // System.out.print("Input a string: ");
        // String userInput = input.nextLine();
        // String reversedString = "";

        // for (int i = 0; i < userInput.length(); i++) {
        //     reversedString = userInput.charAt(i) + reversedString;
        // }

        // if (reversedString.equals(userInput)) {
        //     System.out.println("This word is a palindrome");
        // } else {
        //     System.out.println("This word is not a palindrome");
        // }

        // System.out.print("Enter a word: ");
        // String word = input.nextLine();
        // int vowelCounter = 0;
        // int consonantCounter = 0;
        // for (int i = 0; i < word.length(); i++) {
        //     char character = word.charAt(i);
        //     if ("aeiou".indexOf(character) != -1) {
        //         vowelCounter++;
        //     }
        //     else {
        //         consonantCounter++;
        //     }
        // }
        // System.out.println("There are " + vowelCounter + " vowels in this word and " + consonantCounter + " consonants");

        // System.out.print("Input a word: ");
        // String word = input.nextLine();
        // int counter = 0;
        // String printed = "";
        // for (int i = 0; i < word.length(); i++) {
        //     if (counter % 2 == 0) {
        //         printed = printed + word.charAt(i);
        //     }
        //     counter++;
        // }
        // System.out.println(printed);

        // System.out.print("Input a string: ");
        // String userInput = input.nextLine();
        // String reversedString = "";
        // for (int i = 0; i < userInput.length(); i++) {
        //     reversedString = userInput.charAt(i) + reversedString;
        // }
        // System.out.println(reversedString);

        // System.out.print("Input a 13 digit number: ");
        // String number = input.nextLine();
        // int total = 0;
        // for (int counter = 0; counter < 12; counter++) {
        //     int digit = number.charAt(counter) - '0';
        //     if (counter % 2 == 0) {
        //         total = total + digit;
        //     }
        //     else {
        //         total = total + (3 * digit);
        //     }
        // }
        // int overallTotal = (10 - total % 10) % 10;
        // if (overallTotal == number.charAt(12) - '0') {
        //     System.out.println("Valid input");
        // }
        // else {
        //     System.out.println("Invalid input");
        // }

        // System.out.print("Input a number: ");
        // int number = input.nextInt();
        // int total = 0;
        // for (int i = 1; i <= 9; i++) {
        //     for (int j = i + 1; j <= 9; j++) {
        //         for (int k = j + 1; k <= 9; k++) {
        //             if (i + j + k == number) {
        //                 System.out.println(i + "," + j + "," + k);
        //                 total++;
        //             }
        //         }
        //     }
        // }
        // if (total == 0) {
        //     System.out.println("There are no matches");
        // }

        // int secret = 45;
        // System.out.print("Guess the number: ");
        // int guess = input.nextInt();
        // while (secret != guess) {
        //     System.out.print("Wrong! Guess the number: ");
        //     guess = input.nextInt();
        // }
        // System.out.println("Correct!");

        // System.out.print("Enter a sentence: ");
        // String sentence = input.nextLine();
        // String word = "";
        // for (int i = 0; i < sentence.length(); i++) {
        //     char character = sentence.charAt(i);
        //     if (character != ' ') {
        //         word = word + character;
        //     }
        //     else {
        //         System.out.println(word);
        //         word = "";
        //     }
        // }
        // System.out.println(word);

    }
}
