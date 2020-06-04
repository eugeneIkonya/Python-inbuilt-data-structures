#first way that is not a copy
#this is refrencing a list any changes made to either will affect the other
first=[1,2,3,4]
second=first

second.append(5)

print(first)
print(second)

#the copying is done as so
third=second.copy()
third.append(6)

print(second)
print(third)