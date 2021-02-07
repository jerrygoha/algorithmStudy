s1, s2 = input().split()
hour = int(s1)
minute = int(s2)
if minute>=45:
    print(hour,minute-45)
else:
    if hour==0:
        print("23",minute+15)
    else:
        print(hour-1,minute+15)
