lis1 = list(input("Enter the list1 : ").split(","))
lis2 = list(input("Enter the list2 : ").split(","))

res = []

for i in lis2:
    if i % 2 == 0:
        res.extend(str(i))
for j in lis1:
    if j % 2 != 0:
        res.extend(str(j))

print(res)