num=int(input("Enter how many numbers for fibonacci: "))
a, b = 0, 1


for _ in range(1,num+1):
   print(a, end=" ")
   a, b = b, a + b
   