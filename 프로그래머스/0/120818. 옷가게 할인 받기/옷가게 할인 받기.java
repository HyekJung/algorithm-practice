class Solution {
    public int solution(int price) {
        int total = price / 10000;
        int answer = 0;
        
        if(total >= 50){
            answer = (int)(price * 0.8);
        }else if(total >= 30){
            answer = (int)(price * 0.9);
        }else if(total >= 10){
            answer = (int)(price * 0.95);
        }else{
            answer = price;
        }
        
        return answer;
    }
}