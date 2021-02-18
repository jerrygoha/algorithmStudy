#재귀
def cntPerson(k,n):
    if k==0:
        return n
    s=0
    for i in range(i, n+1):
        s += cntPerson(k-1, i)
    return s

for i in range(int(input())):
    k=int(input())
    n=int(input())
    print(cntPerson(k, n))