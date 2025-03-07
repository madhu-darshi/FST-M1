def sum_of_list(lis):
    sum = 0
    for i in lis:
        sum += int(i)
    return sum

lis1 = list(input("enter the list using comma separated : ").split(","))

print("The sum of the given list values is ", sum_of_list(lis1))