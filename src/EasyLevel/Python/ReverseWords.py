import sys

theFile = open(sys.argv[1], "r")
for line in theFile:
	printReverse(line.strip())

def printReverse(phrase):
	print(phrase[phrase.find(' ') + 1:len(phrase)], phrase[:phrase.find(' ')])