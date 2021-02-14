l1 = [[0 for i in range(10)] for j in range(10)]

#미로 구성
for i in range(10):
    k = list(map(int, input().split()))
    for j in range(10):
        l1[i][j] = k[j]

x=1
y=1

while l1[x][y]!=2:
    l1[x][y]=9
    if (l1[x+1][y]==1 and l1[x][y+1]==1) or (x==8 and y==8):
        break
    if l1[x][y+1]==0 or l1[x][y+1]==2:
        y+=1
    elif l1[x][y+1]==1 and (l1[x+1][y]==0 or l1[x+1][y]==2):
        x+=1
l1[x][y]=9

for i in range(10):
    for j in range(10):
        print(l1[i][j], end=" ")
    print("")


