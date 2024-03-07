import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        ArrayList as = new ArrayList();
        int answer = 0;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt>=3){
               as.add(i);
            }
        }
        return as.size();
    }
}