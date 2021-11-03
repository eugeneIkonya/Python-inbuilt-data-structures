from pwn import xor

val="0e0b213f26041e480b26217f27342e175d0e070a3c5b103e2526217f27342e175d0e077e263451150104"
mess=bytes.fromhex(val)

result = xor(mess[:7],"crypto{")
partial_key = result.decode()+'y'
print(partial_key)
complete_key = (partial_key * (len(mess)//len(partial_key)+1))[:len(mess)]
print(complete_key)

flag = xor(mess,complete_key)
print(flag)