class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        
        for(char ch : s.toCharArray()){
            if(isFirst){
                sb.append(Character.toUpperCase(ch)); //첫 번째 문자 대문자로
                isFirst = false; //대문자로 변환하면 첫 번째 문자 끝
            }else{
                sb.append(Character.toLowerCase(ch));
            }
            
            if(ch == ' '){ //공백으로 나뉘어져있으면 true(첫 번째 글자라는 뜻)
                isFirst = true;
            }
        }
        return sb.toString();
    }
}