#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'distinctMoves' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER n
#  3. INTEGER x
#  4. INTEGER y
#

def distinctMoves(s, n, x, y):
    # Write your code here
    r_count = s.count("r")
    l_count = s.count("l")
    print(r_count, l_count)
    need_to_go = y-x
    abs_rMinl = abs(r_count-l_count)
    if abs_rMinl>need_to_go:
        if r_count>l_count:
            r_count-=(abs_rMinl-need_to_go)
        else:
            l_count-=(abs_rMinl-need_to_go)

    print(r_count, l_count)

    move_count = 0
    if r_count>l_count:
        while l_count>=0:
            move_count+=1
            l_count-=1
            r_count-=1
    else:
        while r_count>=need_to_go:
            move_count+=1
            r_count-=1
            l_count-=1

    print(move_count)

if __name__ == '__main__':
    #rrlrlr, n = 판길이, x = 시작, y = 끝
    s = "rrlrlr"
    n = 6
    x = 1
    y = 3
    result = distinctMoves(s, n, x, y)
    # print(result)
