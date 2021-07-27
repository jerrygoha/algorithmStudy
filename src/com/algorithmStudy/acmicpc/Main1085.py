import math
class Escape:
    # (x, y) : 현위치
    # 왼 아래 꼭짓점 (0, 0), 오른 위 꼭짓점 (w, h)
    def solve(self, x, y, w, h):
        #가로, 세로 최소값
        wMin = 0
        hMin = 0

        #가로부분 최소값
        if (w/2)<=x:
            wMin = w-x
        else:
            wMin = x

        #세로부분 최소값
        if (h/2)<=y:
            hMin = h-y
        else:
            hMin = y

        #각 최소값 비교후 더 작은값 출력
        print(min(wMin, hMin))

if __name__ == "__main__":
    a = Escape()
    x, y, w, h = map(int, input().split())
    a.solve(x, y, w, h)