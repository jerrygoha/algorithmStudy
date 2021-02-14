#a=고정비용 b=가변비용 c=노트북가격
a, b, c = map(int, input().split())
if b>=c:
    print(-1)
else:
    print(a//(c-b)+1)

