class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        int [] result = new int[absolutes.length];
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==false){
                result[i] = absolutes[i]*-1;
            }else{
                result[i] = absolutes[i];
            }
        }
        for(int answer : result){
            sum+=answer;
        }
        return sum;
    }
}