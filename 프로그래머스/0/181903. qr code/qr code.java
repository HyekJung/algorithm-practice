class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        //각 인덱스를 순회하기 위한 반복문
        for(int i = 0; i < code.length(); i++){
            char qr = code.charAt(i);
            if(i % q == r){ //인덱스를 q로 나눈 나머지가 r일 때
                answer += qr; // 그 인덱스의 문자 붙이기
            }
        }
        return answer;
    }
}