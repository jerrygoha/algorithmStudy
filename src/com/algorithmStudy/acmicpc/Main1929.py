import math

#시간초과
def solve(m, n):

    resultList = list(range(m, n+1))
    #에라토스테네스의 체 에서는 2부터 n의 제곱근까지의 수를 확인하기때문에 n의 제곱근까지 리스트 하나 만들어줌
    sqrtList = list(range(2, math.ceil(math.sqrt(n))+1))


    for i in sqrtList:
        for value in resultList:
            if value//i==1:
                pass
            elif value%i==0:
                # sqrtList.remove(i)
                resultList.remove(value)

    print(*resultList, sep="\n")

#다른풀이
def otherSolve(m, n):
    #index => 숫자, value => 소수인지 아닌지?
    resultList = [True for _ in range(n+1)]
    #0과 1은 소수가 될 수 없음
    resultList[0] = False
    resultList[1] = False

    # 에라토스테네스의 체
    # 2부터 n의 제곱근까지의 모든 수를 확인하며, i가 소수인 경우 i를 제외한 모든 배수를 지우도록 한다.
    for i in range(2, math.ceil(math.sqrt(n))+1):
        if resultList[i]:
            #i를 제외한 모든 i의 배수 지우기
            for delt in range(i*2, len(resultList), i):
                resultList[delt] = False

    #출력부
    for i in range(m, n+1):
        if resultList[i]==True:
            print(i)

if __name__ == "__main__":
    a, b = map(int, input().split(" "))
    otherSolve(a, b)