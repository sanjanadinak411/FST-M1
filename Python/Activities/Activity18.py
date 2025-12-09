import pandas

dataframe=pandas.read_csv("Usernames.csv",index_col=False)
print(dataframe)

print1=pandas.DataFrame(dataframe, columns=['usernames'])
print(print1)

print2=pandas.DataFrame(dataframe,index=[1])
#print2=dataframe.get[1]
print(print2)

print(dataframe.sort_values(by='usernames'))


print4=dataframe.sort_values('Passwords', ascending=False)
print(print4)