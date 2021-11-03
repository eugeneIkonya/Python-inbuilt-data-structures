def extendedGcd(a,b):
    if a == 0:
        return b,0,1

    gcd,u1,v1= extendedGcd(b%a,a)

    u = v1 - (b//a) * u1
    v = u1

    return gcd,u,v

print(extendedGcd(26513,32321))

