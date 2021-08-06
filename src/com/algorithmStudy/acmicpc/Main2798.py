import itertools

class Blackjack :
    def blackjack(self, n, m, cardList) :

        self.cardList = cardList
        #카드 순서대로 정렬 후, 연산을 위해 뒤집음
        self.cardList.sort()
        self.cardList.reverse()

        condition = True

        #brute force start
        while condition :
            


        


        return 0

if __name__ == "__main__" :
    case1 = Blackjack()
    #input
    n, m = map(int, input().split())
    cardList = list(map(int, input().split()))
    case1.blackjack(n, m, cardList)