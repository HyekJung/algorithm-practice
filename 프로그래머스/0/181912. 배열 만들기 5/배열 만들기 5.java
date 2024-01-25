import java.util.ArrayList;
class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int word = 0;
        for(int i = 0; i<intStrs.length; i++){
            word = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(k<word){
                list.add(word);
            }
        }
        return list;
    }
}