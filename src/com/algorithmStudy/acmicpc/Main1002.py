import math
class Turret:
    # 조규현의 좌표(x1, y1)(원의 중심), 조규현과 류재명과의 거리 r1(반지름)
    # 백승환의 좌표(x2, y2)(원의 중심), 백승환과 류재명과의 거리 r2(반지름)

    # 1.두 원이 일치하는 경우
    # 2.두 원이 한 점에서 만나는 경우(외접, 내접)
    # 3.두 원이 두 점에서 만나는 경우
    # 4.두 원이 만나지 않는 경우
    def coordinate(self, x1, y1, r1, x2, y2, r2):
        #각 점간의 거리
        r = math.sqrt(((x2-x1)**2)+((y2-y1)**2))
        # r1, r2, r 값끼리 길이 비교를 할 경우를 대비해 최대값과 이외 값들 분리.
        # 아래 연산 후 rList에는 최대값을 제외한 두 값 존재

        rList = [r1, r2, r]
        maxR = max(rList)
        rList.remove(maxR)

        #두 원이 일치하는경우
        if r==0 and r1==r2:
            return -1
        #두 원이 한 점에서 만나는 경우(외접)
        elif r == r1+r2:
            return 1
        #두 원이 한 점에서 만나는 경우(내접)
        elif  maxR == sum(rList):
            return 1
        #두 원이 만나지 않는 경우
        #r, r1, r2 중 가장 긴 값이 나머지 두 값의 합 보다 큰 경우
        elif maxR > sum(rList):
            return 0
        #두 원이 두 점에서 만나는 경우
        else:
            return 2


if __name__ == "__main__":
    a = Turret()
    resultList = []
    t = int(input())
    for _ in range(t):
        x1, y1, r1, x2, y2, r2 = map(int, input().split())
        resultList.append(a.coordinate(x1, y1, r1, x2, y2, r2))

    print(*resultList, sep="\n")
