import itertools
class Test :
    def permutation(self):
        # n=5, r=2
        resultList = list(itertools.permutations(["1", "2", "3", "4", "5"], 2))
        print("경우의 수 : {}개".format(len(resultList)))
        print(*resultList, sep="\n")

    def product(self):
        # n=5, r=2
        resultList = list(itertools.product(["1", "2", "3", "4", "5"], repeat=2))
        print("경우의 수 : {}개".format(len(resultList)))
        print(*resultList, sep="\n")

    def combinations(self):
        # n=5, r=2
        resultList = list(itertools.combinations(["1", "2", "3", "4", "5"], 2))
        print("경우의 수 : {}개".format(len(resultList)))
        print(*resultList, sep="\n")

    def combinations_with_replacement(self):
        # n=5, r=2
        resultList = list(itertools.combinations_with_replacement(["1", "2", "3", "4", "5"], 2))
        print("경우의 수 : {}개".format(len(resultList)))
        print(*resultList, sep="\n")

    def product_with_others(self):
        firstList = ["A", "B", "C"]
        secondList = [100, 200, 300]
        thirdList = [0.001, 0.002, 0.003]

        resultList = list(itertools.product(*[firstList, secondList, thirdList]))
        print("경우의 수 : {}개".format(len(resultList)))
        print(*resultList, sep="\n")

if __name__ == "__main__" :
    class1 = Test()
    print("*" * 15)
    print("  Permutation")
    print("*" * 15)
    class1.permutation()
    print("*" * 15)
    print("    product")
    print("*" * 15)
    class1.product()
    print("*" * 15)
    print("  combinations")
    print("*" * 15)
    class1.combinations()
    print("*" * 15)
    print("  combinations_with_replacement")
    print("*" * 15)
    class1.combinations_with_replacement()
    print("*" * 15)
    print("  product_with_others")
    print("*" * 15)
    class1.product_with_others()