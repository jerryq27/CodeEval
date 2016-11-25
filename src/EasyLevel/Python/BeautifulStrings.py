import sys


def determine_worth(beautiful_string):
	value = 26
	letters = []
	for char in beautiful_string:
		if char.isalpha():
			letters.append(char)
	letters = set(letters)
	occurances = []
	for letter in letters:
		occurances.append(beautiful_string.count(letter))

	worth = 0
	occurances = sorted(occurances, reverse=True)
	for occurance in occurances:
		worth += int(occurance) * value
		value -= 1
	print(worth)


with open(sys.argv[1], 'r', encoding="UTF-8") as input_file:
	for line in input_file:
		determine_worth(line.lower())