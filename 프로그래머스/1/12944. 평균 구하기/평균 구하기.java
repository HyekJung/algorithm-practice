class Solution {
    public double solution(int[] arr) {
        double tot = 0;
        for(int array : arr){
            tot+=array;
        }
        return tot/arr.length;
    }
}