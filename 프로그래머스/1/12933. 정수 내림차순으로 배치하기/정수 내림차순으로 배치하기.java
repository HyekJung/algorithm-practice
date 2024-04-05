import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        //문자열 변환
        String str = String.valueOf(n);
        //배열 생성
        String[] strArr = str.split("");
        
        //문자열 정렬
        Arrays.sort(strArr);
        
        String anArr = "";
        
        //정답 - 문자열 붙이기(내림차순)
        for(String arr : strArr){
            anArr = arr + anArr;
        }

        //정수로 변환
        answer = Long.parseLong(anArr);

        return answer;
    }
}