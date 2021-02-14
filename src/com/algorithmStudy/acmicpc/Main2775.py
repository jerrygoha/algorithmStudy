#수정중
t = int(input())
resident = []
def howmany(k, n):
    if k==0:
        j=0
        for i in range(1, n+1):
            j += i
        return j
    else:
        return howmany(k-1, n)

for i in range(t):
    k = int(input())
    n = int(input())


