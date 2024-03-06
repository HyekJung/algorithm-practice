import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList answer = new ArrayList();
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        Collections.reverse(answer);
        return answer;
    }
}