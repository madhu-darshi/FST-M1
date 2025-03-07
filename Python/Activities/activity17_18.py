import pandas as pd

data = {
    "username" : ["admin","Charles","Deku"],
    "password" : ["password","Charl13","AllMight"]
}

df = pd.DataFrame(data)
#write to data
df.to_csv("credentials.csv",index = False)

#read the data
input_data = pd.read_csv("credentials.csv")

#Print the values only in the Usernames column
print(input_data["username"]) #gives ["admin","Charles","Deku"]

#Print the username and password of the second row
print(input_data["username"][1]) #gives Charles
print(input_data["password"][1]) #gives Charl13


#Sort the Usernames column data in ascending order and print data
username_sorted = input_data.sort_values("username")
print(username_sorted)

#Sort the Passwords column in descending order and print data
password_sorted = input_data.sort_values("password",ascending=False)
print(password_sorted)