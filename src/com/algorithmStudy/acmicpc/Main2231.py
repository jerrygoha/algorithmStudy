class divSum :
    #brute force
    def isDivsum(self, n):
        for tempN in range(1, 1000001):
            self.divSum = 0
            #각 자리 숫자 하나하나 뜯어서 그냥 더하자. why? 몇째자리까지 있을지 어떻게 알고?
            for value in str(tempN):
                self.divSum += int(value)
            self.divSum += tempN
            if self.divSum==n:
                return tempN
            else :
                pass
        return 0

if __name__ == "__main__" :
    a = divSum()
    n = int(input())
    print(a.isDivsum(n))