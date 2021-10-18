def sorting(list):
    return None

if __name__ == "__main__":
    n = int(input())
    inputList = []
    for _ in range(n):
        inputList.append(int(input()))
    inputList.sort()
    print(*inputList, sep="\n")