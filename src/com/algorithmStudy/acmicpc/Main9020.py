import math
class GoldBah:

    #생성자
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
        firstNum = n
        leftNum = 0
        rightNum = 0
        for index, value in enumerate(self.minorityList):
            if value==False:
                pass
            #소수 빼기
            elif value==True:
                if index>(n//2):
                    return "{} {}".format(leftNum, firstNum-leftNum)
                rightNum = firstNum-index
                if self.minorityList[rightNum]==False:
                    pass
                #뺀값이 소수
                elif self.minorityList[rightNum]==True:
                    leftNum = index
                    pass



if __name__ == "__main__" :
    a = GoldBah()
    caseNumber = int(input())
    resultList = []
    for caseCnt in range(caseNumber):
        n = int(input())
        resultList.append(a.solve(n))

    print(*resultList, sep="\n")

