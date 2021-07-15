import math
def solve(a, b):
    resultList = list(range(a, b+1))

    #1은 소수가 아니므로 있다면 제거하자.
    if 1 in resultList:
        resultList.remove(1)

    #에라스토스테네스의 체 사용
    for i in range(2, math.ceil(math.sqrt(b))):
        for temp in resultList:
            if temp/i==1:
                pass
            elif temp%i==0:
                resultList.remove(temp)

    #범위 내에 소수가 없다면 -1 반환
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