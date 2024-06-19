class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(String s : str){
            if(!answer.contains(s)){ //s가 없다면 추가
                answer += s;
            }
        }
        
        return answer;
    }
}