class Solution {
    public int solution(int n) {
        String []answer = (String.valueOf(n)).split("");
        int total=0;
        for(int i=0; i<answer.length; i++){
            total+=Integer.parseInt(answer[i]);
        }
        return total;
    }
}