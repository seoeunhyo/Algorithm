
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    sum = 0
    for i in range(1, n+1):
        if i % 2 == 0:
            sum -= i
        else:
            sum += i

    print("#{} {}".format(test_case, sum ))