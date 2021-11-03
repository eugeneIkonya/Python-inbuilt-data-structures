def gcd(a,b):
    if a == 0:
        return b
    return gcd(b%a,a)

print("this is the gcd is : " + str(gcd(12,8)))

print("this is the gcd is : " + str(gcd(66528,52920)))
