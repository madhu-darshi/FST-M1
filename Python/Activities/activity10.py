tup = tuple(input("ENter the numbers : ").split(","))

#num = (1,5,10,90,21)

for num in tup:
    if int(num) % 5 == 0:
        print(num)