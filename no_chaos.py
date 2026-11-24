# for counter in range(100,1000):
    
#     digits = counter%10
#     digits2 = (counter//10)%10
#     digits3 = (counter//100)
#     if (digits**2 + digits2**2 + digits3**2 == counter):
#         print(counter, end=' ')
#     else:
#         continue

# user_input = int(input("Input a number(-1 to stop): "))
# counter = 1
# total = 0
# while user_input != -1:
#     total+=user_input
#     average = total/counter
#     counter+=1
#     print(f"The average is {average}")
#     user_input = int(input("Input a number(-1 to stop): "))

# user_input = input("Input a string: ")
# reversed_string = ""
# for character in user_input:
#     reversed_string = character + reversed_string
# if reversed_string == user_input:
#     print("This word is a palindrome")
# else:
#     print("This word is not a palindrome")

# word = input("Enter a word: ").lower().strip()
# vowel_counter = 0
# consonant_counter = 0
# for character in word:
#     if character in 'aeiou':
#         vowel_counter+=1
#     else:
#         consonant_counter+=1
# print(f"There are {vowel_counter} vowels in this word and {consonant_counter} consonants in this word")

# word = input("Input a word: ")
# counter = 0
# for character in word:
#     if counter%2 == 0:
#         print(character, end=' ')
#     counter+=1

# user_input = input("Input a string: ")
# reversed_string = ""
# for character in user_input:
#     reversed_string = character + reversed_string
# print(reversed_string)

# number = input("Input a 13 digit number: ")
# total = 0
# num = 0
# if len(number) != 13:
#     print("Invalid")
# else:
#     for character in number:
#         counter = 0
#         if counter%2 == 0:
#             num = int(counter)
#             total+=num
#         else:
#             num = int(counter)
#             total = total +3*num
# overall_total = 10-(total)%10
# if overallTotal == (num%10):
#     print("Valid input")
# else:
#     print("Invalid Input")


# user_input = int(input("Input a number: "))
# total = 0
# for counter in range(1,10):
#     for counter1 in range(counter+1, 10):
#         for counter2 in range(counter1+1, 10):
#             if (counter+counter1+counter2) == user_input:
#                 print(f"{counter},{counter1},{counter2}")
#             else:
#                 print("There are no matches")

# import random
# rand_num = random.randrange(1,101)
# guesses = 0
# user_input = int(input("Input a number: "))
# while user_input != rand_num:
#     user_input = int(input("Input a number: "))
#     guesses+=1
# print("Well guessed")
# print(f"You took {guesses} attempts")

# sentence = input("Enter a sentence: ")
# word = ""
# for character in sentence:
#     if character != "":
#         word+=character
#     else:
#         print(word)
#         word = ""





