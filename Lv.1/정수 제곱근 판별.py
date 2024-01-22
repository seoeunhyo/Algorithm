import math
def solution(n):
    m = math.sqrt(n)
    string = str(m)
    if len(string[string.index('.'):-1]) > 3:
        return -1
    else:
        return int((m+1)**2)

print(solution(121))