s1 = input()
testscore = int(s1)
if 90<=testscore and testscore<=100:
    print("A")
elif 80<=testscore and testscore<=89:
    print("B")
elif 70 <= testscore and testscore <= 79:
    print("C")
elif 60<=testscore and testscore<=69:
    print("D")
else:
    print("F")