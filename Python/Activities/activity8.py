lis = list(input("Enter the list : ").split(","))

print("the list entered is ",lis)
first_num = lis[0]
last_num = lis[-1]

if first_num == last_num:
    print("First and last matches!")
else:
    print("First and last is not matched!")