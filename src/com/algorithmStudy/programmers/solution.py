import time
def solution(X):
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


if __name__ == '__main__':
    start = time.time()
    number = int(input())
    print(solution(number))
    print("time :", time.time() - start)  # 현재시각 - 시작시간 = 실행 시간
