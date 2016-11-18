import sys

def determine_if_happy(number):
    current_val = 0
    max_iters = 100
    while number != "1" and max_iters != 0:
        current_val = 0
        for digit in number:
            current_val += int(digit) ** 2
        number = str(current_val)
        max_iters -= 1

    if max_iters == 0:
        print("0")
    else:
        print("1")

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        determine_if_happy(test.strip())
        