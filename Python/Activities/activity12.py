def recur_add(num):
    if num:
        return num + recur_add(num - 1)
    else:
        return 0

number =  int(input("enter the num for sum : "))
res = recur_add(number)

print(res)