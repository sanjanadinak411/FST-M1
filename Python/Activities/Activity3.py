print("choose rock or paper or scissors: " )
user1_selection=input("")
user2_selection=input("")

if(user1_selection==user2_selection):
    print("its a tie")
elif(user1_selection=="rock"):
    
    if(user2_selection=="paper"):
        print("paper wins!")
    elif(user2_selection=="scissors"):
        print("rock wins!")

elif(user1_selection=="paper"):

    if(user2_selection=="rock"):
        print("paper wins!")
    elif(user2_selection=="scissors"):
        print("scissors wins!")

elif(user1_selection=="scissors"):
    
    if(user2_selection=="rock"):
      print("rock wins!")
    elif(user2_selection=="paper"): 
      print("scissors wins!")
    