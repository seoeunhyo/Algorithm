def solution(s):
    number_lst = {'zero':0,'one':1, 'two':2, 'three':3, 'four':4, 'five':5, 'six':6, 'seven':7, 'eight':8, 'nine':9}
    temp_number = ''
    answer = ''
    cnt = 0

    while cnt < len(s):

        if (s[cnt].isnumeric()):
            answer += s[cnt]

        else:
            temp_number += s[cnt]
            if temp_number in number_lst:
                answer += str(number_lst[temp_number])
                temp_number = ''
        cnt += 1

    return int(answer)

print(solution("23four5six7"))