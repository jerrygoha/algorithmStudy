# import itertools
#
# def solution(n, info):
#     answer = []
#     #어피치과녁배열 뒤집기
#     rev_info = info.reverse()
#     # 화살쏘는 모든 경우의 수
#     resultList = list(itertools.product(["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"], repeat=5))
#     print("경우의 수 : {}개".format(len(resultList)))
#     # 최고점수
#     chi = 0
#     for value in resultList:
#         chai = checkMax(value, rev_info)
#         if chi<chai:
#             chi = chai
#
#     if chi<=0:
#         return [-1]
#     else
#
#     return answer
#
# def checkMax(x, lionPan):
#     apPan = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
#     apScore = 0
#     lionScore = 0
#     for num in x:
#         apPan[int(num)-1] += 1
#
#     print(apPan)
#
#     for i in range(10):
#         if apPan[i]==lionPan[i]:
#             lionScore += i+1
#         elif apPan[i]>lionPan[i]:
#             apScore += i+1
#         else:
#             lionScore += i+1
#
#     return lionScore-apScore
#
#
# if __name__ == "__main__":
#     solution(5, [2,1,1,1,0,0,0,0,0,0,0])