def solution(array):
    answer = 0
    
    for a in array:
        a = str(a)
        answer += a.count('7')
    return answer