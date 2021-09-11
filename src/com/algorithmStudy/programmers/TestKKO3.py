import datetime as dt
import math

def solution(fees, records):
    #차량번호 : [입차시간 출차시간]
    car_num_list = []

    #차량번호 정렬부터 하자.
    for value in records:
        time, carNum, inout = value.split(" ")
        car_num_list.append(carNum)
    car_num_list = sorted(list(set(car_num_list)))

    #딕셔너리 생성
    car_record_dic = {value : [] for value in car_num_list}
    #value값에 입차시간 출차시간 입력
    for value in records:
        time, carNum, inout = value.split(" ")
        car_record_dic[carNum].append(time)

    #각 차 번호의 입출차시간 길이가 홀수면(=출차기록이 없다) 23:59 출차 입력
    for key in car_record_dic:
        if len(car_record_dic[key])%2 == 1:
            car_record_dic[key].append("23:59")

    #각 차량별 주차 시간 계산
    timeformat = "%H:%M"
    car_time_dic = {value: 0 for value in car_num_list}
    for key in car_time_dic:
        carInOutLen = len(car_record_dic[key])
        for i in range(0, carInOutLen, 2):
            start_time = dt.datetime.strptime(car_record_dic[key][i], timeformat)
            end_time = dt.datetime.strptime(car_record_dic[key][i+1], timeformat)
            car_time_dic[key]+=int((end_time-start_time).seconds/60)

    #주차비 계산
    car_charge_dic = {value: 0 for value in car_num_list}
    for key in car_time_dic:
        if car_time_dic[key]>fees[0]:
            car_charge_dic[key] = fees[1] + (math.ceil((car_time_dic[key] - fees[0]) / fees[2])) * fees[3]
        else :
            car_charge_dic[key] = fees[1]

    return list(car_charge_dic.values())

if __name__ == "__main__":
    #fee 기본시간(분), 기본요금(원), 단위시간(분), 단위요금(원)
    fees = [180, 5000, 10, 600]
    #records 시각, 차량번호, 내역
    records = ["05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"]
    solution(fees, records)