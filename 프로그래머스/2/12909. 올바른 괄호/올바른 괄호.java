class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for(String str : s.split("")){
            if(str.equals("(")){
                count++;
            }else{
                if(count == 0){ 
                    return false;
                }
                count--; //'('를 넣으면 ')'빼기
            }
        }
        return count == 0;
    }
}