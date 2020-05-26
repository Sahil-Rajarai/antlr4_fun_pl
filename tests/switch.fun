# Tests switch command with boolean arg

func int invert (bool b):
  int result = 0
  switch b:
    case true:
      result = 0
    default:
      result = 1
  .
  return result
.

proc main ():
  write(invert(true))
.