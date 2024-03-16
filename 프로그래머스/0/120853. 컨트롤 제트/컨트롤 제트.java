class Solution {
    public int solution(String s) {
        int answer = 0;
        String []text = s.split(" ");
        for(int i=0; i<text.length; i++){
            if(text[i].equals("Z")&&i!=0){
                answer-=Integer.parseInt(text[i-1]);
            }else{
                answer+=Integer.parseInt(text[i]);
            }
        }
        return answer;
    }
}