import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String word = n+"";
        String [] arr = word.split("");
        for(String array : arr){
            answer+=Integer.parseInt(array);
        }
        return answer;
    }
}