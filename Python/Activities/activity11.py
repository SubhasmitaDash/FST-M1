fruits_dict= {
    "mango":60,
    "apple":200,
    "grapes":40
}
availablity=input("which fruit you want? ")
if availablity in fruits_dict:
    print("fruit is available")
else:
    print("fruit is not available")