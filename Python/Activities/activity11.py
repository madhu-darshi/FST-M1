fruits = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

find = input("What are you looking for? ").lower()

if(find in fruits):
    print("Yes, available")
else:
    print("No, not available")