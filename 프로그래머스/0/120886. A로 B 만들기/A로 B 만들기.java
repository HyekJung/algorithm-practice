import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        //정렬
        Arrays.sort(be);
        Arrays.sort(af);
        
        String befor = "";
        String aft = "";
        
        for(int i = 0; i < be.length; i++){
            befor += be[i];
            aft += af[i];
        }
        
        return befor.equals(aft) ? 1 : 0;
    }
}