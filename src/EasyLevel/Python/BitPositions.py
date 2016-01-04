import sys

def bit_positions(line):
	numbers = line.split(",")
	number = int(numbers[0])
	pos1 = int(numbers[1])
	pos2 = int(numbers[2])
	binary_rep = "{:b}".format(number)
	if binary_rep[len(binary_rep)-pos1] == binary_rep[len(binary_rep)-pos2]:
		print("true")
	else:
		print("false")

the_file = open(sys.argv[1], "r")
for line in the_file:
	bit_positions(line)