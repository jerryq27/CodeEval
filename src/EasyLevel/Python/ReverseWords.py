import sys

def printReverse(phrase):
	print(phrase[phrase.find(' ') + 1:len(phrase)], phrase[:phrase.find(' ')])

theFile = open(sys.argv[1], "r")
for line in theFile:
	if line.strip() != "":
		printReverse(line.strip())
