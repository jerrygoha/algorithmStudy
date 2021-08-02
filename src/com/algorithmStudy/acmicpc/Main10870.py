def fibo(n):
    if n >= 2 :
        return fibo(n-1) + fibo(n-2)
    else :
        return n

if __name__ == "__main__":
    input = int(input())
    print(fibo(input))