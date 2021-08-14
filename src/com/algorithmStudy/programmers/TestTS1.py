import math
def solution(orderAmount, taxFreeAmount, serviceFee):
    # orderAmount : 주문금액
    # taxFreeAmount : 비과세금액
    # serviceFee : 봉사료
    # answer : 부가가치세
    #부가가치세 = 공급대가(orderAmount) - 공급가액
    #공급대가 = 주문금액(orderAmount) - 봉사료(serviceFee)
    #과세금액 = 공급가액 - 비과세금액

    answer11 = orderAmount - serviceFee - taxFreeAmount
    if answer11==1:
        return 0
    else :
        return math.ceil(answer11/11)

    return answer

