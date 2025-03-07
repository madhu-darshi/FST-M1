def fib(num):
    if num <= 1:
        return 1
    else:
        return fib(num -1) + fib(num - 2)
        
inp = int(input("enter a number: "))

for i in range(inp):
    print(fib(i))