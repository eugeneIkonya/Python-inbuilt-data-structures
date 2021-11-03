string = "label"
flag=""

for letter in string:
    flag += chr(ord(letter) ^ 13)

print(flag)


