def solution(amountText):
    answer = True
    isCom = False
    #가장 왼쪽 숫자 체크
    if amountText[0] == 0:
        answer = False
        return answer
    #0~9사이의 숫자 또는 구분자로만 구성되는지 체크
    for value in amountText:
        if ord(value)==44:
            isCom = True
            continue
        elif (48<=ord(value) and ord(value)<=57):
            continue
        else:
            answer = False
            return answer
    #구분자 올바르게 찍혔는지 체크
    if isCom==True:
        nonComVer = int(amountText.replace(",", ""))
        re_nonComVer = format(nonComVer, ",")
        if amountText != str(re_nonComVer):
            answer = False
            return answer

    return answer

if __name__ == "__main__" :
    solution("3,900")