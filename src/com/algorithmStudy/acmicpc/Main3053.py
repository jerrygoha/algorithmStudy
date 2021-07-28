import math
class Taxi:
    #유클리드 기하학에서의 원의 넓이
    def euclid(self, r):
        return '{:.6f}'.format(round(r**2*math.pi, 6))
    #택시 기하학에서의 원의 넚이
    def taxi(self, r):
        return '{:.6f}'.format(round(2*(r**2), 6))

if __name__ == "__main__":
    a = Taxi()
    inputNum = int(input())
    print(a.euclid(inputNum))
    print(a.taxi(inputNum))
