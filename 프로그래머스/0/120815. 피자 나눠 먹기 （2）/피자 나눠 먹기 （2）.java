class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(true){
            
            if(6 * answer % n == 0){ //모두 다 먹을 경우
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}