book="The Hitchicker's Guide to the Galaxy"
book_list=list(book)

print(book_list)
#print the first three values in the list
print(book_list[0:3])

#stop examples
#to create a string of the first three letters
print(''.join(book_list[0:3]))
#creating a string of the last three letters
print(''.join(book_list[-6:]))

#stepping example
#to reverse the list
backwards=book_list[::-1]
print(''.join(backwards))

#create a string with every second letter in the list
every_other=book_list[::2]
print(''.join(every_other))

#to select a word from the list string
word=book_list[4:14]
print(''.join(word))

#to show the same word but in reverse
reverse_word=book_list[13:3:-1]
print(''.join(reverse_word))
