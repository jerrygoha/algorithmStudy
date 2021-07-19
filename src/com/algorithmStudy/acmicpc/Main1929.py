import math

def solve(m, n):

    # #처음에 모든 수가 소수(True)라고 초기화
    # resultList = [True for i in range(m, n+1)]
    resultList = list(range(m, n+1))
    #에라토스테네스의 체 에서는 2부터 n의 제곱근까지의 수를 확인하기때문에 n의 제곱근까지 리스트 하나 만들어줌
    sqrtList = list(range(2, math.ceil(math.sqrt(n))+1))

    #에라토스테네스의 체
    #2부터 n의 제곱근까지의 모든 수를 확인하며, i가 소수인 경우 i를 제외한 모든 배수를 지우도록 한다.
    for i in sqrtList:
        for value in resultList:
            if value//i==1:
                pass
            elif value%i==0:
                # sqrtList.remove(i)
                resultList.remove(value)

    print(*resultList, sep="\n")

if __name__ == "__main__":
    a, b = map(int, input().split(" "))
    solve(a, b)