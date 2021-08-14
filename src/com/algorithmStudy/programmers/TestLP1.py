import itertools

class Programing1 :

    def product(self, inputDelimiters):
        #delimiters갯수
        self.inputDelimitersLength = len(inputDelimiters)
        #중복순열로 delimiters 경우의 수 전부 구하기.
        self.resultProductList = list(itertools.product(inputDelimiters, repeat=self.inputDelimitersLength))
        #경우의 수
        self.productCount = len(self.resultProductList)
        #log
        print(self.productCount)
        #print(*self.resultProductList, sep="\n")

    def insertDelimiters(self, inputList):

        for productTuple in self.resultProductList:
            print(("{}"+"{}".join(list(productTuple))+"{}").format(*inputList))


if __name__ == "__main__" :
    a = Programing1()

    inputDelimiters = list(input())
    inputList = list(input())

    # delimiters 중복순열 리스트.
    a.product(inputDelimiters)
    # inputList에 delimiters 조합하여 삽입
    a.insertDelimiters(inputList)