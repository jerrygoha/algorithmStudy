import math
def solve(a, b):
    resultList = list(range(a, b+1))
    tempList = list(range(2, b+1))

    for i in range(2, math.ceil(math.sqrt(b))):
        for temp in resultList:
            if temp/i==1:
                pass
            elif temp%i==0:
                resultList.remove(temp)

    if not resultList:
        return -1
    else:
        sum = 0
        for i in resultList:
            sum += i
        min = resultList[0]

        return "{}\n{}".format(sum, min)


if __name__ == "__main__":
    a = int(input())
    b = int(input())
    print(solve(a, b))