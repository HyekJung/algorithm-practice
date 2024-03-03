class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            int newInx;
            if(direction.equals("right")){
                newInx = (i+1)%numbers.length;
            }else{
                newInx = (i-1+numbers.length)%numbers.length;
            }
            answer[newInx] = numbers[i];
        }
        return answer;
    }
}