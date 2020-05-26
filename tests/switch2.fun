func int test (int n):
  int r = 0
  int s = 0
  switch n:
    case 1:
      r = 1
      s = 2
    case 2..4:
      s = 3
    default:
      r = 4
  .
  return r
.

proc main ():
  write(test(1))
  write(test(4))
  write(test(7))
.