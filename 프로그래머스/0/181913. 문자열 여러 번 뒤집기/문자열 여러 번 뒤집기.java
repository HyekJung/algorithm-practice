class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        //문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        
        for(int[] query : queries){
            //문자 뒤집는 메소드 호출
            strReverse(charArray, query[0], query[1]);
        }
        
        //문자열 변환
        for(char array : charArray){
            answer+=array;
        }
        
        return answer;
    }

    //문자 바꾸는 메소드
    private static char[] strReverse(char[] arr, int start, int end){
        //문자 바꾸기
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //다음 요소로 이동
            start++;
            end--;
        }
        return arr;
    }
}