import itertools
def solution(numOfStairs):
    #중복순열사용
    stairS = [1, 2, 3]
    resultList = []

    for repCount in range(2, numOfStairs+1):
        resultList .append(list(itertools.product(stairS, repeat=repCount)))
    #중복제거 및 깔끔하게
    newResultList = list(set(itertools.chain(*resultList)))

    #각 요소 체크하여 계단 수보다 큰 경우는 제거
    for index, tupleInList in enumerate(newResultList):
        print(tupleInList)
        if sum(tupleInList)!=numOfStairs:
            print(sum(tupleInList), numOfStairs)
            del newResultList[index]

    print(newResultList)

if __name__ == "__main__" :
    solution(5)