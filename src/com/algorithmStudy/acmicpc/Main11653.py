import math
def solve(x):
    # #에라토스테네스의 체를 사용해서 소수 리스트 생성
    #시간초과때문에 해당 로직은 제외하고 그냥 전부다 돌리기로...
    # tempList = list(range(2, x))
    #
    # for i in range(2, math.ceil(math.sqrt(x))):
    #     for temp in tempList:
    #         if temp/i==1:
    #             pass
    #         elif temp%i==0:
    #             tempList.remove(temp)

    #만든 소수 리스트로 입력받은 수를 나눠보자! -> 위의 이유로 소수 리스트가 아닌 전부다!
    dev = x
    while dev!=1:
        for value in range(2, x+1):
            if dev % value == 0:
                print(value)
                dev = dev // value
                break


if __name__ == "__main__":
    a = int(input())
    solve(a)