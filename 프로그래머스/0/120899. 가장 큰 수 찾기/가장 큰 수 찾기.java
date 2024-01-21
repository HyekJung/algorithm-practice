class Solution {
    public int[] solution(int[] array) {
        int max= array[0];
        int cnt = 0;
        int [] answer = new int[2];
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
                cnt = i;
            }
        }
        answer[0] = max;
        answer[1] = cnt;
        return answer;
    }
}