
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    date = input()
    year = date[:4]
    month = date[4:6]
    day = date[6:]
    flag = True

    #월이 유효한가
    if not (1 <= int(month) <= 12):
        flag = False
        print("#{} {}".format(test_case,-1))

    # 각 달의 일이 맞는지
    if int(month) in [1,3,5,7,8,10,12]:
        if not (1<= int(day) <= 31):
            flag = False
            print("#{} {}".format(test_case, -1))
    if int(month) in [4,6,9,11]:
        if not (1<= int(day) <= 30):
            flag = False
            print("#{} {}".format(test_case, -1))
    if int(month)  == 2:
        if not (1<= int(day) <= 28):
            flag = False
            print("#{} {}".format(test_case, -1))
    if(flag):
        print("#{} {}/{}/{}".format(test_case,year,month,day))
