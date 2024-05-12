class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            int sum = 0;
            
            for(int j = i; j <= n; j++){ //숫자 i 제외한 누적값
                sum += j;
                if(sum == n){
                    answer++; //경우의 수 증가
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}