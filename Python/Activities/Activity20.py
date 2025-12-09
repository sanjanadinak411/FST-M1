import pandas

dataframe=pandas.read_excel("data.xlsx")
print(dataframe)
print(dataframe.shape)
print(f"number of rows is {dataframe.shape[0]}")
print(f"number of columns is {dataframe.shape[1]}")

print(dataframe['Email'])
print(dataframe.sort_values('FirstName'))
