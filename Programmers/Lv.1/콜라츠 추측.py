def solution(num):
    answer = 0
    cnt = 0

    while True:
        if num == 1:
            answer = cnt
            break

        if cnt > 500:
            answer = -1
            break
        if num % 2 == 0:
            num //= 2
        else:
            num = (num * 3) + 1

        cnt += 1
    return answer


print(solution(6))

