import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList solution(String myString) {
        String[] as = myString.split("x");
        ArrayList list = new ArrayList();
        
        for(String str : as){
            if (!str.isEmpty()){
            list.add(str);
            }
        }
        for(int i = 0; i<list.size(); i++){
            list.remove("x");
        }
        Collections.sort(list);
        
        return list;
    }
}