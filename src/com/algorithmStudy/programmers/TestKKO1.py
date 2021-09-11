class pg1 :
    def solution(self, id_list, report, k):
        answer = []
        reportCount_id_list = dict.fromkeys(id_list,0) #신고당한횟수
        whoReport_id_list = {value : [] for value in id_list} #누구한테 신고당했는지
        emailSendCount_id_list = dict.fromkeys(id_list,0) #이메일전송횟수
        report_set = list(set(report)) #report 중복제거
        for value in report_set:
            reporter, reported = value.split(" ")
            reportCount_id_list[reported] += 1
            whoReport_id_list[reported].append(reporter)

        for value in reportCount_id_list:
            if reportCount_id_list[value]>=k:
                for who in whoReport_id_list[value]:
                    emailSendCount_id_list[who] += 1

        answer = list(emailSendCount_id_list.values())

        return answer

if __name__ == "__main__":
    id_list = ["muzi", "frodo", "apeach", "neo"]
    report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
    k = 2
    a = pg1()
    print(a.solution(id_list, report, k))