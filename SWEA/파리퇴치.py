
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n,m = map(int, input().split(" "))

    originArr= [list(map(int, input().split(" "))) for _ in range(n)]
    sumArr = [[0 for _ in range(n+1)] for _ in range(n+1)]

    for i in range(1,n+1):
        for j in range(1,n+1):
            sumArr[i][j] = sumArr[i-1][j]+sumArr[i][j-1] - sumArr[i-1][j-1] + originArr[i-1][j-1]

    max_sum = 0

    for i in range(n - m + 1):  # 행 탐색 범위
        for j in range(n - m + 1):  # 열 탐색 범위
            print(i,j)
            sum_submatrix = sumArr[i + m][j + m] - sumArr[i][j + m] - sumArr[i + m][j] + sumArr[i][j]
            if sum_submatrix > max_sum:
                max_sum = sum_submatrix

    print("#{} {}".format(test_case, max_sum))

