class Solution {
    public int solution(String A, String B) {
        
        for(int i = 0; i < A.length(); i++){
            if(A.equals(B)){ //문자가 같아지면 종료
                return i;
            }
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1); //반복하면서 밀기
        }
        return -1;
    }
}