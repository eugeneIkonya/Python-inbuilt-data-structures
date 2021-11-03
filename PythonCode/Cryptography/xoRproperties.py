def xor_letters(str1, str2):
    if len(str1) == len(str2):
      return ''.join(format(int(a, 16) ^ int(b, 16), 'x') for a,b in zip(str1,str2))


KEY1 = "a6c8b6733c9b22de7bc0253266a3867df55acde8635e19c73313"

KEY2 = xor_letters("37dcb292030faa90d07eec17e3b1c6d8daf94c35d4c9191a5e1e", KEY1)
print(KEY2)

KEY3 = xor_letters("c1545756687e7573db23aa1c3452a098b71a7fbf0fddddde5fc1", KEY2)
print(KEY3)

KEY4 = xor_letters(xor_letters(KEY1, KEY2), KEY3)
print(KEY4)

FLAG = xor_letters("04ee9855208a2cd59091d04767ae47963170d1660df7f56f5faf", KEY4)
print(bytes.fromhex(FLAG))

