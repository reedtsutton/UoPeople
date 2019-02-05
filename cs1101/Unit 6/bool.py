# the compare function
def compare(a,b):        
    if a > b:
        return 1
    elif a == b:
        return 0
    elif a < b:
        return -1

#print the results of the testing as requested by the assignment
print('result returned when a is greater than b', compare(5,3))
print('result returned when a is less than b',compare(2,5))
print('result returned when a is equal to b',compare(3,3))
print('\n') #print a new line to separate testing from the user result

#prompt for user input
num1=input('please enter a number \n')
num2=input('please enter another number \n')
#return user input with description
print("result returned from your input is:", compare(num1,num2))
