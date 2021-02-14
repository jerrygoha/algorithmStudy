import math
t = int(input())
l1 = []
for i in range(t):
    h, w, n = map(int, input().split())
    hotel = [[0 for i in range(w)] for j in range(h)]
    #층 : n번째손님 / 전체높이(층) 의 나머지
    if n%h==0:
        #꼭대기층일경우
        yy=h
    else:
        yy = n%h
    #호수 : n번째손님 / 전체 층 수 의 몫(올림)
    xx = math.ceil(n/h)
    l1.append("{0}{1:0>2}".format(yy, xx))

for i in l1:
    print(i)