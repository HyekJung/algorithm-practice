class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sbr = new StringBuilder();
        
        for(int i = c - 1; i < my_string.length(); i += m){ //m칸씩 이동, c번째 문자 추출
            sbr.append(my_string.charAt(i));
        }
        
        return sbr.toString();
    }
}