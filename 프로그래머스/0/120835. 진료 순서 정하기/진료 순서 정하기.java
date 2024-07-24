class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){ //자신의 값보다 크면
                    answer[i]++; //순위 뒤로 밀려남
                }
            }
            answer[i]++; //순위는 1위부터 시작
        }
        return answer;
    }
}