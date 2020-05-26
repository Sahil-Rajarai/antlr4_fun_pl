# Test functions.
bool verbose = false

func int fac (int n):  # Return n!
	int f = 1
	for i = 2 to n:
		f = f*i .
	return f .

proc main ():
# Read integers and write their factorials.
# Terminate when 0 is read.
	int num = read()
	while not (num == 0):
		if verbose: write(num) .
		write(fac(num))
		num = read() .
.
