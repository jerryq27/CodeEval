import sys

def find_multiple(line):
	numbers = line.split(",")
	x = int(numbers[0])
	n = int(numbers[1])
	multiple = n
	while(multiple < x):
		multiple += n
	print(multiple)

the_file = open(sys.argv[1], "r")
for line in the_file:
	find_multiple(line)