numlist1=[2,4,5,9]
numlist2=[11,28,8]
newlist=[]

for numbers in numlist1:
    if(numbers%2!=0):
        newlist.append(numbers)
for numbers in numlist2:
    if(numbers%2==0):
        newlist.append(numbers)

print(newlist)