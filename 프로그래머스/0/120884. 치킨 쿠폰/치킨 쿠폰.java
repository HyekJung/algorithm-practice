class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        for(int i = 0; i < chicken; i++){
            coupon++; // 한마리당 쿠폰 하나씩
            if(coupon % 10 == 0){ //서비스
                coupon++; //쿠폰
                answer++; //치킨 서비스
            }
        }
        return answer;
    }
}