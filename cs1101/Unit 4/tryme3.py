#Using the IDLE development environment, create a Python script named tryme3.py . Write a function in
#this file called nine_lines that uses a function called three_lines to print nine blank lines. Now add a
#function named clear_screen that prints out twenty-five blank lines. The last line of your program should
#call the function to clear_screen

def new_line():
    print()
   
def three_lines():
    new_line()
    new_line()
    new_line()
   
def nine_lines():
    print ('Printing nine lines')
    three_lines()
    three_lines()
    three_lines()

def clear_screen():
    print ('printing twenty-five lines')
    new_line()
    three_lines()
    three_lines()
    three_lines()
    three_lines()
    three_lines()
    three_lines()
    three_lines()
    
clear_screen()
