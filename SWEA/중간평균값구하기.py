
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):

    num = list(map(int, (input().strip().split())))


    num.sort()

    sum = 0
    for i in range(1,len(num)-1):
        sum += num[i]

    print("#{} {}".format(test_case, round(sum / (len(num)-2))))
