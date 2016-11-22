import sys

	
def print_intersection(line):
	segments = line.split(';')
	
	first_seg = segments[0].split(',')
	second_seg = segments[1].split(',')

	new_list = sorted(list(set(first_seg).intersection(second_seg)))
	print(','.join(new_list))

	# More complex version >.<
	# first_seg_len = len(first_seg)
	# second_seg_len = len(second_seg)
	# # Trim the arrays to match
	# if first_seg_len > second_seg_len:
	# 	trim_amount = first_seg_len - second_seg_len
	# 	first_seg = first_seg[trim_amount:]
	# elif first_seg_len < second_seg_len:
	# 	trim_amount = second_seg_len - first_seg_len
	# 	second_seg = second_seg[:-trim_amount]

	# # Find the intersection with the now parallel arrays.
	# intersection = ''
	# seg_len = len(first_seg)
	# first_seg_count = 0
	# second_seg_count = 0
	# while first_seg_count < seg_len:
	# 	if first_seg[first_seg_count] == second_seg[second_seg_count]:
	# 		intersection += first_seg[first_seg_count] + ','
	# 		second_seg_count += 1 
	# 	else:
	# 		if first_seg_count + 1 != seg_len and intersection != '':
	# 			intersection = ''
	# 	first_seg_count += 1
	# if intersection != '':
	# 	print(intersection[:-1])
	# else:
	# 	print()

with open(sys.argv[1], 'r', encoding="UTF_8") as input_file:
	for line in input_file:
		print_intersection(line.strip())