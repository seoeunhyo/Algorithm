def solution(n):
    answer = 0
    answer_ls = []
    for i in range(n+1):
        for j in range(n+1):
            if i*j == n:
                if i not in answer_ls:
                    answer_ls.append(i)

                if j not in answer_ls:
                     answer_ls.append(j)

    return sum(answer_ls)

# 절반 이상을 볼 필요가 없음
def sumDivisor(num):
    # num / 2 의 수들만 검사하면 성능 약 2배 향상잼
    return num + sum([i for i in range(1, (num // 2) + 1) if num % i == 0])
