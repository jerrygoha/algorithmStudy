#idea : 리스트 합치며 중복값이 있다면 관계!

class Programing2 :
    def unionTogether(self, relationsList):
        self.relationsList = relationsList
        breakBool = True
        whileBool = True
        #브루트포스..?
        while whileBool:
            breakBool = True
            for indexFirst in range(len(self.relationsList)) :
                if indexFirst == len(self.relationsList)-1:
                    whileBool = False
                else :
                    for indexSecond in range(indexFirst+1, len(self.relationsList)):
                        #리스트 합치면서 중복값이 있다면?!
                        if len(self.relationsList[indexFirst])+len(self.relationsList[indexSecond]) > len(self.relationsList[indexFirst].union(self.relationsList[indexSecond])):
                            #합집합 만들어서 리스트 갱신 후 다시 처음부터
                            (self.relationsList[indexFirst]).update(self.relationsList[indexSecond])
                            self.relationsList.remove(self.relationsList[indexSecond])
                            #print(self.relationsList)
                            breakBool = False
                            break
                        else:
                            pass
                    #이중for문 탈출
                    if breakBool==False:
                        break

        print(len(self.relationsList))

if __name__ == "__main__" :
    a = Programing2()
    n = int(input())
    relationsList = []
    #삽입
    for i in range(n):
        relationsList.append(set(input().split()))


    a.unionTogether(relationsList)