import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList as = new ArrayList();
        
        for(int i =0; i<=my_string.length()-1; i++){
          as.add(my_string.substring(i));
        }
        Collections.sort(as);
        return as;
    }
        
}