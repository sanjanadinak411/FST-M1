numlist1=[2,4,6,8]
numlist2=[3,5,6,7,2]
numlist_final=[]


for s in numlist1:
    if(s%2==0):
        print(f"{s} is even")
    else:
       numlist_final.append(s) 
    
for s in numlist2:
     if(s%2==0):
       numlist_final.append(s)
    
print(numlist_final)      