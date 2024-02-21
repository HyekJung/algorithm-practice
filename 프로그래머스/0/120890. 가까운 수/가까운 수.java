class Solution {
    public int solution(int[] array, int n) {
        int min = Math.abs(array[0]-n);
        int answer = array[0];
        for(int i=1; i<array.length; i++){
            if(Math.abs(array[i]-n)<min){
                answer = array[i];
                min = Math.abs(array[i]-n);
            }else if(Math.abs(array[i]-n)==min){//가까운 수가 1개 이상일 때
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}