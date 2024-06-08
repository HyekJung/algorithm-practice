class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String arr = String.valueOf(num); //정수로 변환
        
        for(int i = 0; i < arr.length(); i++){
            if(arr.charAt(i) == (char) (k + '0')){
                return i + 1;
            }
        }
        return -1;
    }
}