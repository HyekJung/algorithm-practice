class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        if(charArray.length%2==1){
            answer = charArray[charArray.length/2]+"";
        }else{
            answer= (charArray[charArray.length/2-1]+"")
                + (charArray[charArray.length/2]+"");
        }
        return answer;
    }
}