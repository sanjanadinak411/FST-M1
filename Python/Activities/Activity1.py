from datetime import datetime


name=input("Enter your name: ")
print("Username is: " + name)

age=input("Enter your age: ")
age_100=100-int(age)
current_year = datetime.now().year
year_100=current_year+age_100

print(f"The year when {name} turns 100 is {year_100}")