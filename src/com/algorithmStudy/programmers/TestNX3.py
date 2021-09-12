def getTheGroups(n, queryType, students1, students2):
    # Write your code here
    answerList = []
    assembled_List = []
    for i in range(1, n+1):
        assembled_List.append(set(["{}".format(i)]))
    print(assembled_List)
    for i in range(len(queryType)):
        if queryType[i]=="Friend":
            assembled_List.append(set("{} {}".format(students1[i], students2[i]).split()))
        else :
            resultUnion_List = unionTogether(assembled_List)
            print(i, resultUnion_List)
            answer = 2
            for j in resultUnion_List:
                print(students1[i], students2[i])
                if str(students1[i]) in j:
                    answer += len(j)-1
                if str(students2[i]) in j:
                    answer += len(j)-1

            answerList.append(answer)

    print(assembled_List)
    # resultUnion_List = unionTogether(assembled_List)

    print(answerList)


def unionTogether(listinput):
    relationsList = listinput
    breakBool = True
    whileBool = True
    # 브루트포스..?
    while whileBool:
        breakBool = True
        for indexFirst in range(len(relationsList)):
            if indexFirst == len(relationsList) - 1:
                whileBool = False
            else:
                for indexSecond in range(indexFirst + 1, len(relationsList)):
                    # 리스트 합치면서 중복값이 있다면?!
                    if len(relationsList[indexFirst]) + len(relationsList[indexSecond]) > len(
                            relationsList[indexFirst].union(relationsList[indexSecond])):
                        # 합집합 만들어서 리스트 갱신 후 다시 처음부터
                        (relationsList[indexFirst]).update(relationsList[indexSecond])
                        relationsList.remove(relationsList[indexSecond])
                        # print(self.relationsList)
                        breakBool = False
                        break
                    else:
                        pass
                # 이중for문 탈출
                if breakBool == False:
                    break

    return relationsList

if __name__ == '__main__':
    getTheGroups(15, ['Friend', 'Total','Friend', 'Total'], [1, 1, 1, 1], [2, 3, 15, 14])