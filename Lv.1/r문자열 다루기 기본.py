def solution(s):
    answer = True
    try:
        a = int(s)
        if len(s) not in [4,6]:
            answer = False
    except(ValueError):
        answer = False
    return answer

print(solution("1234"))

def alpha_string46(s):
    #함수를 완성하세요

    return s.isdigit() and len(s) in [4,6]

