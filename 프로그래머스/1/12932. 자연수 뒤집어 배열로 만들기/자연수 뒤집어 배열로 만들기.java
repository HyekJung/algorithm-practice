class Solution {
    public int[] solution(long n) {
        //자연수를 문자열로 변환
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        int[] answer = new int[strArr.length];
        
        //뒤집기, 정답 배열 대입
        for(int i = 0; i<strArr.length; i++){
            //배열 뒤에서부터
            answer[(strArr.length - 1) - i] = Integer.parseInt(strArr[i]); //문자열 배열이므로 다시 정수로 반환
        }
        return answer;
    }
}