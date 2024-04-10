T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = input()

    str = ""
    str2 = ""
    for i in range(len(n)):
        str += n[i]
        if str == n[i+1 : i+len(str)+1]:
            print(n[i : i+len(str)])
            print("#{} {}".format(test_case, len(n)//len(str)))
            break


