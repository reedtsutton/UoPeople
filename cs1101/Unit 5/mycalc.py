fnum=float(input("Please enter a number."))

while fnum == 0:
    print("error,number cannot be zero")
    fnum=float(input("Please enter a different number."))

op = int(input("Please enter an operation; 1=add, 2=subtract, 3=multiply, 4=divide"))

while op > 4 or op < 1:
    print("error")
    op=int(input("Invalid, please enter again"))

snum = float(input("Please enter a second number."))

while snum == 0:
    print("error,number cannot be zero")
    snum=float(input("Please enter a different number."))

if op == 1:
           var=fnum+snum
elif op == 2:
           var=fnum-snum
elif op == 3:
           var=fnum*snum
elif op == 4:
           var=fnum/snum

print(var)
exit()
           

