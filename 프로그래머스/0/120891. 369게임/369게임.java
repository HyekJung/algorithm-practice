class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] ordered = String.valueOf(order).split(""); //원소 확인을 위한 문자열 배열 변환
        
        for(int i = 0; i < ordered.length; i++){
            String clap = ordered[i];
            if(clap.equals("3") || clap.equals("6") || clap.equals("9")){ //3,6,9
                answer++; // 박수치기
            }
        }
        return answer;
    }
}