import numpy as np

def solution(board, skill):
    answer = 0
    resultBoard = np.array(board)

    #게임시작!
    for turn in skill:
        # 스킬판 생성
        skillBoard = np.array([[turn[5]]*(turn[4] - turn[2] + 1)]*(turn[3] - turn[1] + 1))
        if turn[0]==1: #공격
            resultBoard[turn[1]:turn[3]+1, turn[2]:turn[4]+1] -= skillBoard
        else:
            resultBoard[turn[1]:turn[3] + 1, turn[2]:turn[4] + 1] += skillBoard

    #건물 체크
    flatterResult = np.array(resultBoard).flatten().tolist()
    for value in flatterResult:
        if value>0:
            answer+=1

    print(resultBoard)
    print(answer)

    return answer

if __name__ == "__main__":
    board = [[5,5,5,5,5],[5,5,5,5,5],[5,5,5,5,5],[5,5,5,5,5]]
    #type, (r1, c1), (r2, c2), degree만큽
    #type : 1=공격, 2=회복
    skill = [[1,0,0,3,4,4],[1,2,0,2,3,2],[2,1,0,3,1,2],[1,0,1,3,3,1]]
    solution(board, skill)