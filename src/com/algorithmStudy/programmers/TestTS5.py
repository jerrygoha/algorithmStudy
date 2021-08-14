def solution(fruitWeights, k):
    answer = []
    for index in range(len(fruitWeights)-(k-1)):
        answer.append(max(fruitWeights[index : index+k]))

    newAnswer = list(set(answer))
    newAnswer.sort(reverse=True)

    return newAnswer

if __name__ == "__main__":
    solution([10, 50, 20, 40, 20, 30], 3)