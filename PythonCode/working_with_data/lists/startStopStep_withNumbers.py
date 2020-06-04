#syntax is letters(start:stop:step)
#start->default value is zero
#stop->default value is maximum allowed for the list
#step->default value is 1
saying="Don't Panic"
letters=list(saying)

print(letters)

print(letters[0:10:3])
print(letters[0:9:2])
print(letters[0:8:2])

#with start only starts at index 3
print(letters[3:])

#with stop only
print(letters[:8])

#with only step
print(letters[::2])



