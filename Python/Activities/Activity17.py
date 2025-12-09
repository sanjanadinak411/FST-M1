import pandas
"""
data={'Usernames':'Passwords',
      'admin':'password',
      'Charles':'Charl13',
      'Deku':'AllMight'}
"""

data= {
    "usernames":["admin","Charles","Deku"],
    "Passwords": ["password","Charl13","AllMight"]
}
                    
csvfile=pandas.DataFrame(data)

csvfile.to_csv("Usernames.csv",  index=False)
print(csvfile)
