import itertools

class Blackjack :
    def blackjackItertools(self, n, m, cardList) :

        #m에 최대한 가까운 카드 3장의 합
        maxSum = 0

        #조합 사용하여 모든 경우 구하고 그중 조건 만족하는 제일 큰 경우
        resultList = list(itertools.permutations(cardList, 3))

        #각 경우의 수(튜플)의 합계를 구하면서 max값 갱신
        for tuple in resultList :
            newTuple = list(tuple)
            if sum(newTuple)>m :
                continue
            else :
                maxSum = max(maxSum, sum(newTuple))

        print(maxSum)

    def blackjackBruteForce(self, n, m, cardList):

        #m에 가까운 최대값
        maxSum = 0

        #Brute Force
        for firstPickIndex in range(n):
            for secondPickIndex in range(firstPickIndex+1, n):
                for thirdPickIndex in range(secondPickIndex+1, n):
                    if cardList[firstPickIndex] + cardList[secondPickIndex] + cardList[thirdPickIndex] > m:
                        continue
                    else:
                        maxSum = max(maxSum, cardList[firstPickIndex]+cardList[secondPickIndex]+cardList[thirdPickIndex])

        print(maxSum)


if __name__ == "__main__" :
    case1 = Blackjack()
    #input
    n, m = map(int, input().split())
    cardList = list(map(int, input().split()))
    print("-----Using Itertools-----")
    case1.blackjackItertools(n, m, cardList)
    print("-----Using Brute Force-----")
    case1.blackjackBruteForce(n, m, cardList)