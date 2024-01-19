import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList as = new ArrayList();
        
        for(int i = 0; i<my_string.length(); i++){
            if('0'<=my_string.charAt(i)&&my_string.charAt(i)<='9'){
                as.add(my_string.charAt(i)-'0');
            }
        }
        Collections.sort(as);
        
        return as;
    }
}