vowels=['a','e']#list declaraion
vowels2=['o','u','i']
word="Milliways" #decalring a list word

def remove__item(list,value):
    list.remove(value)

def  extend__list(list1,list2):
    list1.extend(list2)

remove__item(vowels,'a')
extend__list(vowels,vowels2)
for letter in word:
    if letter in vowels:
        print(letter)






