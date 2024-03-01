def solution(array, height):
    answer = 0
    for one in array:
        if one>height:
            answer+=1
    return answer