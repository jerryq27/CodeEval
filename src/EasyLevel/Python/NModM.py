import sys

def mod(n, m):
	while (n - m) >= 0:
		n -= m

	print(n)

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
    	info = test.split(',')
    	mod(int(info[0]), int(info[1]))    
