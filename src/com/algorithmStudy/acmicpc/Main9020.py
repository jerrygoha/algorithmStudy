import math
class GoldBah:

    def __init__(self):
        #소수 테이블 만들어놓기
        self.minorityList = [True for _ in range(10000)]
        self.minorityList[0] = False
        self.minorityList[1] = False

        for i in range(2, math.ceil(math.sqrt(10000))):
            if self.minorityList[i]:
                for delt in range(i*2, len(self.minorityList), i):
                    self.minorityList[delt] = False



    def solve(self, n):
        #소수 테이블 차례대로 훓으면서..?
        #짝수에서 첫번째 소수를 뺐을때의 결과가 소수여야한다!


        print(self.minorityList)
        return 0

if __name__ == "__main__" :
    caseNumber = int(input())
    # for caseCnt in range(caseNumber):
    #     n = int(input())
    a = GoldBah()
    a.solve(caseNumber)