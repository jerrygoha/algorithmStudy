import math
def solve(x):
    #에라토스테네스의 체를 사용해서 소수 리스트 생성
    tempList = list(range(2, x))

    for i in range(2, math.ceil(math.sqrt(x))):
        for temp in tempList:
            if temp/i==1:
                pass
            elif temp%i==0:
                tempList.remove(temp)

    #만든 소수 리스트로 입력받은 수를 나눠보자!
    dev = x
    while dev!=1:
        for value in tempList:
            if dev % value == 0:
                print(value)
                dev = dev // value
                break


if __name__ == "__main__":
    a = int(input())
    solve(a)