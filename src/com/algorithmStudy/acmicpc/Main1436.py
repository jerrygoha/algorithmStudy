class Catch666:
    def catch666(self, n):
        count = 0
        value = 666
        while count<n:
            if "666" in str(value):
                value += 1
                count+=1
            else:
                value +=1

        print(value-1)

if __name__ == "__main__":
    a = Catch666()
    N = int(input())
    a.catch666(N)