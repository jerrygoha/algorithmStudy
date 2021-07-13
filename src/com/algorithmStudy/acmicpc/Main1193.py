import time
def solution(X):
    #맨첨부터 다 체크하는풀이
    count = 0
    limit = 1
    num, den = 1, 1
    while True :
        if limit % 2 == 0:
            #limit가 짝수일경우 위에서 아래로
            for n in range(1, limit + 1):
                # n = index, d = value
                num = n
                den = limit - n + 1
                count += 1
                # if문(return) 여기
                if count == X:
                    return "{}/{}".format(num, den)
                    break
            limit += 1
        else:
            #limit가 홀수일경우 아래에서 위로
            for n in range(1, limit + 1):
                # n = index, d = value
                num = n
                den = limit - n + 1
                count += 1
                # if문(return) 여기
                if count == X:
                    return "{}/{}".format(den, num)
                    break
            limit += 1

def solutionSec(X):
    #시간복잡도를 줄여봅시다..
    limitCount = 0 #몇번째줄인지
    sum = 0 #합
    #몇번째줄부터 갈건지 체크
    while sum<X:
        limitCount += 1
        sum = limitCount * (limitCount+1) // 2 #시간복잡도 O(1)

    if limitCount%2 ==0:
        num = X - (sum - limitCount)
        den = limitCount - num + 1
        return "{}/{}".format(num, den)
    else:
        num = X - (sum - limitCount)
        den = limitCount - num + 1
        return "{}/{}".format(den, num)


if __name__ == '__main__':
    start = time.time()
    number = int(input())
    print(solutionSec(number))
    print("time :", time.time() - start)  # 현재시각 - 시작시간 = 실행 시간
