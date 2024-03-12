import java.util.ArrayList;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int len: arr){
            answer.add(len);
        }
        int toggleSize = done(arr.length);
        while(answer.size()<toggleSize){
            answer.add(0);
        }
        return answer;
    }
    
    private int done(int n){
        int result = 1;
        while(result<n){
            result*=2;
        }
        return result;
    }
}