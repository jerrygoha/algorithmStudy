class Dongchi :
    def solution(self, inputList):
        #각 사람마다 랭킹 저장하는 리스트
        rankList = []
        for criteria in inputList :
            bigger = 1
            for comparative in inputList :
                if criteria[0]<comparative[0] and criteria[1]<comparative[1]:
                    bigger+=1
            rankList.append(bigger)

        print(*rankList, sep=" ")


if __name__ == "__main__" :
    a = Dongchi()
    inputList = []
    n = int(input())
    for _ in range(n):
        inputList.append(tuple(map(int, input().split())))

    a.solution(inputList)
