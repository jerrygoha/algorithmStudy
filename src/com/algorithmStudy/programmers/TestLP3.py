#idea 0.0.0.0 ~ 255.255.255.255 0000~255255255255 문자열 슬라이스
#입력받은 addr의 길이의 따라 모든 경우의 수로 일단 슬라이스 후, 255가 넘는 수가 포함된건 제거. 이후 갯수 산출
# len(inputIpWithOutPoint) : 슬라이스 자리
# 4 : 1111
# 5 : 1112
# 6 : 1122 1131
# 7 : 1123
# 8 : 1133 2222 3221
# 9 : 1233
# 10 : 3331
# 11 : 3332
# 12 : 3333
import itertools

class IPv4 :
    def __init__(self):
        self.fourList = [1, 1, 1, 1]
        self.fiveList = [1, 1, 1, 2]
        self.sixList = [[1, 1, 2, 2], [1, 1, 3, 1]]
        self.sevenList = [1, 1, 2, 3]
        self.eightList = [[1, 1, 3, 3], [2, 2, 2, 2], [3, 2, 2, 1]]
        self.nineList = [1, 2, 3, 3]
        self.tenList = [3, 3, 3, 1]
        self.elevenList = [3, 3, 3, 2]
        self.twelveList = [3, 3, 3, 3]
        self.numList = [self.fourList, self.fiveList, self.sixList, self.sevenList, self.eightList, self.nineList, self.tenList, self.elevenList, self.twelveList]

    def slice(self, inputIpWithOutPoint):
        #입력받은 add의 길이에 따라 슬라이스
        self.inputIpWithOutPoint = inputIpWithOutPoint
        #모든 경우의 수 보관하는 list
        self.allCase = []

        if len(self.inputIpWithOutPoint) == 6 or len(self.inputIpWithOutPoint)==8:
            for inputList in self.numList[len(self.inputIpWithOutPoint)-4]:
                self.allCase += a.permutation(inputList)
        else :
            self.allCase += a.permutation(self.numList[len(self.inputIpWithOutPoint)-4])

        #슬라이스 경우의 수 출력...
        print(self.allCase)

    #서로 다른 4개중, 4개를 나열하는 경우의 수 산출, set 사용하여 중복되는 원소 제거
    def permutation(self, inputList):
        #모든 경우의 수
        resultPermutationList = list(set(list(itertools.permutations(inputList, 4))))

        #for casePermutation in resultPermutationList :


       #return resultPermutationList


if __name__ == "__main__":
    a = IPv4()
    inputIpWithOutPoint = input()
    a.slice(inputIpWithOutPoint)