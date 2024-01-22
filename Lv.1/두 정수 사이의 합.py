def solution(a, b):
    answer = 0
    if a == b:
        answer = a
    else:
        if a > b:
            temp = a
            a = b
            b = temp
        for i in range(a, b+1):
            answer += i
    return answer


def adder(a, b):
    if a > b:
        a, b = b, a
    return sum(range(a, b + 1))

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print( adder(3, 5))