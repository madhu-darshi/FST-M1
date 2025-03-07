user1 = input("Pleae enter your name user1 : ")
user2 = input("Please enter your name user2 : ")
while True:

    choice1 = input(" Hello "+ user1+", Enter your choice -> Rock/Paper/Scissors  ").lower()
    choice2 = input(" Hello "+user2+", Enter your choice -> Rock/Paper/Scissors  ").lower()
    

    if choice1 == choice2:
        print("Its a draw!")
    elif choice1 == 'rock':
        if  choice2 == 'scissors':
            print(user1+" won!")
        else:
            print(user2+" won!")
    elif choice1 == 'scissors':
        if choice2 == 'paper':
            print(user1+" won!")
        else:
            print(user2+" won!")
    elif choice1 == 'paper':
        if choice2 == 'rock':
            print(user1+" won!")
        else:
            print(user2+" won!")
    else:
        print("Invlaid input! please select only rock / paper / scissors")

    replay = input("Continue? Y/N -->").lower()
    if replay == 'y':
        pass
    elif replay == 'n':
        print("Thank you for playing!!")
        raise SystemExit
    else:
        print("Invalid input! Exiting the game now. Thanks!")
        raise SystemExit

