def solution(n):
    answer = []
    a = str(n)
    for i in range(len(a)-1,-1, -1):
        answer.append(int(a[i]))
    return answer


print(solution(12345))