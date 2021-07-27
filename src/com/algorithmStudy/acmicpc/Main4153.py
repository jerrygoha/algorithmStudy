import math
class Square:
    #피타고라스의 정리 이용
    def isSquare(self, x, y, z):
        temp = [x, y, z]
        #정렬을 통해 가장 긴 변이 리스트의 마지막으로 가도록.
        temp.sort()
        if temp[2]**2 == (temp[0]**2 + temp[1]**2):
            return "right"
        else:
            return "wrong"

if __name__ == "__main__":
    a = Square()
    resultList = []
    while True:
        x, y, z = map(int, input().split())
        if (x+y+z) == 0 :
            break
        else:
            resultList.append(a.isSquare(x, y, z))

    print(*resultList, sep="\n")