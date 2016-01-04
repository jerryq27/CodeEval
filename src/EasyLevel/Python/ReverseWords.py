import sys

def printReverse(phrase):
	words = phrase.split(" ")
	printString = ""
	for word in reversed(words):
		printString += word + " "
	print(printString.strip())


theFile = open(sys.argv[1], "r")
for line in theFile:
	if line.strip() != "":
		printReverse(line.strip())
