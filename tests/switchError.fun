# Tests contextual errors for switch commands

func int test (int num):
  int result = 0
  switch num:
    case 1:
      result = 5          		# overlapping values
    case 3..2:            		#invalid range
      result = 10
    default:
      result = 15
  .
  return result
.

proc main ():
  write(test(5))
.
