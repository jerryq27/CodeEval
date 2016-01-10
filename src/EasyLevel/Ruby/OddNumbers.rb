def print_odd_numbers(limit = 99) 
	for i in 1..limit
		if i % 2 != 0
			puts i
		end
	end
end

print_odd_numbers