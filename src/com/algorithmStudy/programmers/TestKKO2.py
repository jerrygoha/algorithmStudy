import math

def solution(n, k):
        answer = 0
        changeStr = baseChange(n, k)
        checkList = list(filter(None, changeStr.split("0")))

        for value in checkList :
            if is_prime_number(int(value)) and value is not "1":
                answer += 1

        return answer

def is_prime_number(x):
        for i in range(2, int(math.sqrt(x)) + 1):
            if x % i == 0:
                return False
        return True

def baseChange(n, q):
        #10진수 n 을 q진수로 변환
        rev_base = ''
        while n > 0:
            n, mod = divmod(n, q)
            rev_base += str(mod)
        return rev_base[::-1]


if __name__ == "__main__" :

    n = 110011
    k = 10
    print(solution(n, k))
