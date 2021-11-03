val = "73626960647f6b206821204f21254f7d694f7624662065622127234f726927756d"
cipher = bytes.fromhex(val)

val2="0e0b213f26041e480b26217f27342e175d0e070a3c5b103e2526217f27342e175d0e077e263451150104"
cipher2=bytes.fromhex(val2)


def find_num(text):
    flag=""
    for num in range(256):
        results = [chr(a ^ num) for a in text]
        flag = ''.join(results)

        if(flag.startswith("crypto")):
            print(flag)
            return num



print(find_num(cipher))



