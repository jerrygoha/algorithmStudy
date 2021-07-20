import math

def otherSolve():
    #idea : 문제 조건인 1<=n<=123456, 2n까지...를 참고하여,
    #그냥 (123456*2)+1까지 소수 테이블 구한다음에 계산하면...?

    # index => 숫자, boolean => 소수여부
    resultList = [True for i in range(123456*2+1)]
    # 0, 1은 소수가 아니다.
    resultList[0] = False
    resultList[1] = False

    # 에라토스테네스의 체
    for i in range(2, math.ceil(math.sqrt(123456*2))):
        if resultList[i]:
            for delt in range(i * 2, len(resultList), i):
                resultList[delt] = False

    #문제에서 주어진 범위 미리 소수 갯수 계산
    return resultList

if __name__ == "__main__":
    resultList = otherSolve()
    inputList = []

    while True:
        cnt = 0
        n = int(input())
        if n==0:
            break
        else:
            for i in range(n + 1, (2 * n) + 1):
                if resultList[i] == True:
                    cnt += 1
            inputList.append(cnt)

    print(*inputList, sep="\n")

