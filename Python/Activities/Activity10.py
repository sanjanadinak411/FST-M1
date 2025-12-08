
numbers=input("Enter a sequence of comma separated values: ").split(",")
numbers_int = (int(s) for s in numbers)

for num in numbers_int:

    if(num%5==0):
        print(num)