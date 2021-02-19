#반복문
for i in range(int(input())):
    k = int(input())
    n = int(input())
    l = [i for i in range(1, n+1)]
    for _ in range(k):
        for j in range(1, n):
            l[j] += l[j-1]
    print(l[n-1])