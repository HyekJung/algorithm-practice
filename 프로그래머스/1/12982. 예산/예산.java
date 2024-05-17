import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        int answer = 0;
        
        Arrays.sort(d); // 오름차순 정렬
        
        for(int i = 0; i < d.length; i++){
            if(budget >= d[i]){ //예산이 신청금액보다 크면
                budget -= d[i]; //예산에서 뺌
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}