import sys
testcase = sys.stdin.readline()
t1 = int(testcase)
for i in range(0, t1):
    s1, s2 = map(int, sys.stdin.readline().split())
    print(s1+s2)