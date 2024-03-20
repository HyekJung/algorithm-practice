def solution(n, numlist):
    answer = []
    for list in numlist:
        if list%n==0:
           answer.append(list)
    return answer