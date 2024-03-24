class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd=0;
        //num_list를 순회하며 짝수, 홀수 찾기
        for(int num:num_list){
            // 각 갯수 카운트
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        //짝수 홀수의 갯수 넣기
        answer[0]=even;
        answer[1]=odd;
        
        return answer;
    }
}