numlist=[]
numbers=[]
numlist = input("Enter a sequence of comma separated values: ").split(",")
numbers = [int(s) for s in numlist]

element1=numbers[0]
element2=numbers[len(numbers)-1]
 

if (element1==element2):
      print(True)
else:
      print(False)