class Sort:
    def sort(self):
        return None

if __name__ == "__main__":
    a=Sort()
    N = int(input())
    inputList = []
    for _ in range(N):
        inputList.append(int(input()))

    inputList.sort()
    print(*inputList, sep="\n")
