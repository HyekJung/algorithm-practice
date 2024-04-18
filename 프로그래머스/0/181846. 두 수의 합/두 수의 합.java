import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // 정밀 계산을 위한 BigInteger생성
        BigInteger a1 = new BigInteger(a);
        BigInteger a2 = new BigInteger(b);
        
        //덧셈
        BigInteger answer = a1.add(a2);
        
        return answer.toString(); //string타입 변환
    }
}