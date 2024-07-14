class Solution {
    public int solution(int n) {
        int answer = 2;
        
        double sqrt = Math.sqrt(n); //제곱근 구하기
        if(sqrt == (int) sqrt){ //제곱근이 정수라면
            answer = 1;
        }
        return answer;
    }
}