class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //문자 길이 확인
        if(s.length()==4||s.length()==6){
            for(int i=0; i<s.length(); i++){
                //하나라도 숫자가 아니면 break;==false
                if('0'>s.charAt(i)||s.charAt(i)>'9'){
                    answer=false;
                    break;
                }
            }
        }else{
            answer=false;
        }
        return answer;
    }
}