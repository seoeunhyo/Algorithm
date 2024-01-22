def solution(phone_number):
    answer = ''

    string = len(phone_number[:-4])
    answer = '*'*string + phone_number[-4:]
    return answer

print(solution("01033334444"))