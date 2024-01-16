class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String [] string = my_string.split("");
        for(String st : string){
            answer += st.repeat(n);
        }
        return answer;
    }
}