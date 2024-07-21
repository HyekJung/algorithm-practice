class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i < included.length; i++){
            
            if(included[i]){ //true 일 떄
                answer += a;
            }
            
            a += d; //등차수열 더하기
        }
        
        return answer;
    }
}