class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        
        for(int i = 1; factorial<=n; i++){
            factorial*=i;
            if(factorial==n){
                answer=i;
                break;
            }else if(factorial>n){
                answer=(i-1);
                break;
            }
        }
        return answer;
    }
}