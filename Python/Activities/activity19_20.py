import pandas as pd
from pandas import ExcelWriter # import when dealing with excels

#dataset
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
#convert to dataframe
df = pd.DataFrame(data)

#write dataframe to excel
writer = ExcelWriter("sample.xlsx")
df.to_excel(writer,"Sheet1",index=False)

#close the writer
writer.close()

#read from the file
input_data = pd.read_excel("sample.xlsx")


#Print the number of rows and columns
print(input_data.shape) #return rows and colums in tuple as (3,4)
print("The number of rows is {} and column is {}".format(input_data.shape[0],input_data.shape[1]))
#Print the data in the emails column only
print(input_data["Email"])

#Sort the data based on FirstName in ascending order and print the data
print(input_data.sort_values("FirstName"))
