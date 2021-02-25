#전부 나눠보면서 찾는코드
# n = int(input())
# n_list = list(map(int, input().split()))
# cnt = 0
#
# if n==len(n_list):
#     for i in n_list:
#         divCnt = 0
#         for j in range(1, i+1):
#             if i%j==0:
#                 divCnt+=1
#         if divCnt==2:
#             cnt+=1
# print(cnt)

#에라토스테네스의 체
import math
n = int(input())
n_list = list(map(int, input().split()))
n_range = list(range(2,1001))   #자연수 범위를 정함.(소수는 1을 포함하지 않으므로 2부터)
cnt = 0

if n==len(n_list):
    for i in range(2, math.ceil(math.sqrt(1000))):  #p^2>=100인 p의 배수(p제외)까지 지우면 됨
        for j in n_range:
            if j/i==1:                              #자기 자신으로 나뉘는것은 제외
                pass
            elif j%i==0:                            #이외 나뉘는 수가 있다면 그 수를 정수 리스트에서 제거
                n_range.remove(j)
for k in n_list:
    if k in n_range:
        cnt+=1
print(cnt)


