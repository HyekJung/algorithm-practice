class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int arr : array){
            String str = String.valueOf(arr); //char배열로 변환하기 위한 String 변환
            char[] ch = str.toCharArray(); //char 배열로
            
            for(int i = 0; i < ch.length; i++){
                if(ch[i] == '7'){ //만약 char 요소가 7이라면
                    answer++;
                }
            }
        }
        return answer;
    }
}