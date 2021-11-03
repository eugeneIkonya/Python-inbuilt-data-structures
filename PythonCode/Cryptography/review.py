KEY1 = "a6c8b6733c9b22de7bc0253266a3867df55acde8635e19c73313"

#get string
#convert each letter to integer value from their original base 16 and xor them
#return a string of the new xored value

def xor_strings(string1,string2):
    if(len(string1) == len(string2)):
        return ''.join(format(int(a,16) ^ int(b,16),'x') for a,b in zip(string1,string2))

KEY2 = xor_strings(KEY1,"37dcb292030faa90d07eec17e3b1c6d8daf94c35d4c9191a5e1e")
print(KEY2)
KEY3 = xor_strings(KEY2,"c1545756687e7573db23aa1c3452a098b71a7fbf0fddddde5fc1")
print(KEY3)
flag = xor_strings(xor_strings(KEY3,"04ee9855208a2cd59091d04767ae47963170d1660df7f56f5faf"),xor_strings(KEY2,KEY1))
print(bytes.fromhex(flag))