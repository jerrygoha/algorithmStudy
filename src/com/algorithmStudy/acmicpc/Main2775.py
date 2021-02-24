import math
for i in range(int(input())):
    x, y = map(int, input().split())
    dist = y-x
    cnt = 0
    num = math.floor(math.sqrt(dist))
    num_twice = num**2
    num_sqrt = math.sqrt(num_twice)

    if dist == num_twice:
        cnt = (num*2)-1
    elif dist>num_twice and num_twice+num_sqrt>=dist:
        cnt = num*2
    elif dist>num_twice+num_sqrt:
        cnt = (num*2)+1

    print(cnt)




