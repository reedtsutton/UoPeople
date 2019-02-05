
#read in unsorted_txt file
infile = open("unsorted_fruits.txt","r")

#create an empty list
l = []

#read each line(word) in unsorted file, strip white space,  and append to list l
for line in infile.readlines():
    word = line.strip()
    l.append(word)

print(l) #print list for validation

#filter out empty strings - not sure why these are there in the first place :(
l = [str for str in l if str]

#sort the list
l.sort()

print(l) #more validation

#create outfile and write list to it
outfile = open("sorted_fruits.txt","w")
outfile.write('\n'.join(l))

#close files
infile.close()
outfile.close()


