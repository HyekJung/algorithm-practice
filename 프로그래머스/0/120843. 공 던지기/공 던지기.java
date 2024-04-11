class Solution {
    public int solution(int[] numbers, int k) {
        //배열의 길이
        int length = numbers.length;
        //배열의 인덱스
        int index = 0;
        
        //k번째로 공을 던질 때 까지
        for(int i = 1; i<k; i++){ //k번째로 공을 던지는 사람의 번호이므로, 아직 던지면 안됨
            //두 칸씩 건너뛰기
            index +=2;
            index = index % length;
        }

        return numbers[index];
    }
}