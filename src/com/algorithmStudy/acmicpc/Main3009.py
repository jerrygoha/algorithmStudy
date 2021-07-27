import collections
class Fourth:
    # 축에 평행한 직사각형을 만들기 위해서는
    # 직사각형의 꼭짓점들의 좌표는 x, y값들 각각 n, n, t, t 와 같이 두 값이 각각 2개씩있다.
    # 따라서 입력받은 세 좌표값을 x, y 각각의 묶음으로 놓고, 짝이 없는 수가 남은 네 번째 점의 좌표가 될 것.
    def solve(self, inputXlist, inputYlist):

        #가로, 세로별 특정 좌표별, key value 쌍 만들기
        #key : 좌표, value : 갯수
        xCount = collections.Counter(inputXlist)
        yCount = collections.Counter(inputYlist)

        #value값이 1인 key를 추출하기위해 reverse
        reverse_xCount = dict(map(reversed, xCount.items()))
        reverse_yCount = dict(map(reversed, yCount.items()))

        #value값이 1인 key값 추출
        x = reverse_xCount.get(1)
        y = reverse_yCount.get(1)

        return "{} {}".format(x, y)


if __name__ == "__main__":
    a = Fourth()
    #x좌표, y좌표를 각각 리스트로 전달
    inputXlist = []
    inputYlist = []
    for _ in range(3):
        x, y = map(int, input().split())
        inputXlist.append(x)
        inputYlist.append(y)

    print(a.solve(inputXlist, inputYlist))



