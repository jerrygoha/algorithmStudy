#!/bin/python3

import math
import os
import random
import re
import sys
import itertools
#
# Complete the 'paperCuttings' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER textLength
#  2. INTEGER_ARRAY starting
#  3. INTEGER_ARRAY ending
#

def paperCuttings(textLength, starting, ending):
    # Write your code here
    merged_list = list(zip(starting, ending))
    sorted_merged_list = sorted(list(set(merged_list)))
    print(sorted_merged_list)

    len_list = len(sorted_merged_list)
    count = 0
    for startIndex in range(len_list-1):
        for endIndex in range(startIndex+1, len_list):
            if sorted_merged_list[startIndex][1]<sorted_merged_list[endIndex][0]:
                count+=1

    return count

    #메모리초과, 시간초과
    # combination_list = list(itertools.combinations(sorted_merged_list, 2))
    # print(sorted(list(set(combination_list))))
    #
    # count = 0
    # #떨어져있는거 체크
    # for value in combination_list:
    #     if value[1][0]>value[0][1]:
    #         count +=1
    #
    # return count


if __name__ == '__main__':
   print(paperCuttings(10, [3, 1, 2, 8, 8], [5, 3, 7, 10, 10]))
