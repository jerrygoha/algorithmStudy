class Chess :
    def checkModi(self, chessBoard):
        #8x8 체스판 내에 수정해야될 칸의 갯수를 세는 함수
        drawing = 0
        if chessBoard[0][0]=="W":
            for n in range(8):
                for m in range(8):
                    if n==0 or n%2==0: #짝수index
                        if m==0 or m%2==0: #짝수index
                            if chessBoard[n][m]=="B":
                                chessBoard[n][m]="W"
                                drawing+=1
                        else: #홀수index
                            if chessBoard[n][m] == "W":
                                chessBoard[n][m] = "B"
                                drawing += 1
                    else: #홀수index
                        if m==0 or m%2==0: #짝수index
                            if chessBoard[n][m]=="W":
                                chessBoard[n][m]="B"
                                drawing+=1
                        else: #홀수index
                            if chessBoard[n][m] == "B":
                                chessBoard[n][m] = "W"
                                drawing += 1
            return drawing
        elif chessBoard[0][0]=="B":
            for n in range(8):
                for m in range(8):
                    if n==0 or n%2==0: #짝수index
                        if m==0 or m%2==0: #짝수index
                            if chessBoard[n][m]=="W":
                                chessBoard[n][m]="B"
                                drawing+=1
                        else: #홀수index
                            if chessBoard[n][m] == "B":
                                chessBoard[n][m] = "W"
                                drawing += 1
                    else: #홀수index
                        if m==0 or m%2==0: #짝수index
                            if chessBoard[n][m]=="B":
                                chessBoard[n][m]="W"
                                drawing+=1
                        else: #홀수index
                            if chessBoard[n][m] == "W":
                                chessBoard[n][m] = "B"
                                drawing += 1
            return drawing
        else:
            print("잘못된 입력입니다.")
            return -1

if __name__ == "__main__":
    a = Chess()
    #m : 열, n : 행
    n, m = map(int, input().split())
    chessBoard = []
    #초기 전체 판 입력
    for _ in range(n):
        chessBoard.append(list(input()))

    resultList = []
    #8x8 판을 순차적으로 집어서 체크
    for nRange in range(n-7) :
        for mRange in range(m-7) :
            instantList = [[chessBoard[nValue][mValue] for mValue in range(mRange, mRange+8)] for nValue in range(nRange, nRange+8)]
            resultList.append(a.checkModi(instantList))

    resultList.sort()
    print(resultList)
    print(resultList[0])
