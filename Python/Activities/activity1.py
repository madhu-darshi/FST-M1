name = input("Enter your name : ")
age = int(input("Enter your age : "))

year = (2025 - age) + 100

print(name," will be 100 years old in ",year)#one way
print("In {0}, {1} will be 100 years old".format(year,name)) # second way