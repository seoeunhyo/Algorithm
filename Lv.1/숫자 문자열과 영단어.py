def solution(s):
    number_lst = {'one':1, 'two':2, 'three':3, 'four':4, 'five':5, 'six':6, 'seven':7, 'eight':8, 'nine':9}
    temp_number = ''
    answer = ''
    cnt = 0
    flag = True

    while cnt <= len(s)-1:
        if s[cnt].isdigit():
            answer += s[cnt]

        else:
            while flag:

                if temp_number in number_lst:
                    answer += str(number_lst[temp_number])
                    temp_number = ''
                    cnt += 1
                    flag = False

                else:
                    temp_number += s[cnt]
                cnt += 1

            cnt += 1
        cnt += 1

    return answer

print(solution("one4seveneight"))


