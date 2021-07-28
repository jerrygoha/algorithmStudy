class Factorial:
    def fac(self, n):
        if n==1:
            return 1
        else:
            return n*a.fac(n-1)

if __name__ == "__main__":
    a = Factorial()
    inputNum = int(input())
    print(a.fac(inputNum))