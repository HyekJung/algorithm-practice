def solution(n):
    answer = 0
    for even in range(0, n+1, 2):
        answer+=even
    
    return answer