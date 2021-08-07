import itertools

class Blackjack :
    def blackjack(self, n, m, cardList) :

        #m에 최대한 가까운 카드 3장의 합
        max = 0

        #조합 사용하여 모든 경우 구하고 그중 조건 만족하는 제일 큰 경우
        resultList = list(itertools.permutations(cardList, 3))

        #각 경우의 수(튜플)의 합계 브루트포스로 구하면서 max값 갱신
        for tuple in resultList :
            newTuple = list(tuple)
            if sum(newTuple)>max and sum(newTuple)<=m :
                max = sum(newTuple)
            else:
                pass
        print(max)


if __name__ == "__main__" :
    case1 = Blackjack()
    #input
    n, m = map(int, input().split())
    cardList = list(map(int, input().split()))
    case1.blackjack(n, m, cardList)