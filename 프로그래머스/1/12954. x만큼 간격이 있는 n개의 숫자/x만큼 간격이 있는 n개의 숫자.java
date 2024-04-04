class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        //n까지의 반복문
        for(int i = 0; i<n; i++){
            answer[i] = (long)i*x+x;
        }
        return answer;
    }
}