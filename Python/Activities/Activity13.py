numbers=input("Enter a sequence of comma separated values: ").split(",")
num=[]
num = (int(s) for s in numbers)


def sum():
    total=0  
    for item in num:
        total=total+item
    print(total)


sum()
