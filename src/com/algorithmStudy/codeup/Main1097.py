p = [[0 for i in range(20)] for j in range(20)]

for i in range(19):
        x = list(map(int, input().split()))
        for j in range(19):
                p[i+1][j+1] = x[j]

s1 = int(input())
for i in range(s1):
        z1, z2 = input().split()
        n1 = int(z1)
        n2 = int(z2)
        for j in range(1, 20):
                if p[n1][j]==0:
                        p[n1][j]=1
                else:
                        p[n1][j]=0
        for k in range(1, 20):
                if p[k][n2]==0:
                        p[k][n2]=1
                else:
                        p[k][n2]=0

for i in range(1, 20):
        for j in range(1, 20):
             print(p[i][j], end=" ")
        print("")

