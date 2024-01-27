def solution(s):
    answer = ''
    answer_lst = []
    cnt = 0
    for char in s:
        if char == ' ':
            answer_lst.append(" ")
            cnt = 0
            continue
        if cnt % 2 == 0 or cnt == 0:
            answer_lst.append(char.upper())
        else:
            answer_lst.append(char.lower())
        cnt += 1
    answer = ''.join(answer_lst)
    return answer

print(solution("hi everyone"))