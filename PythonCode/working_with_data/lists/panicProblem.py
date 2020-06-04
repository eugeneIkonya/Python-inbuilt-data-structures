phrase ="Don't panic"
pList=list(phrase)
print(pList)

print(phrase)
for i in range(3):
    pList.pop()

pList.pop(0)
pList.remove("'")
pList.extend([pList.pop(),pList.pop()])
pList.insert(2,pList.pop(3))

new_phrase=''.join(pList)
print(pList)
print(new_phrase)






