import sys
inp = sys.stdin.readline()
testcase = int(inp)
for i in range(1, testcase+1):
    print(f"%{testcase}s" % ("*"*i))