def solution(x):
    answer = True
    string = str(x)
    sum = 0
    for i in string:
        sum += int(i)

    if x % sum != 0:
        answer = False
        
    return answer