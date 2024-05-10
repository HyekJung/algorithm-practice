class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i; num <= j; num++){
            String[] arr = String.valueOf(num).split(""); //k를 찾기 위한 배열 변환

            for(String a : arr){
                if(Integer.parseInt(a) == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}