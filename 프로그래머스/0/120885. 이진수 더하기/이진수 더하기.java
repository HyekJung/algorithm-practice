class Solution {
    public String solution(String bin1, String bin2) {
        //결과 저장
        StringBuilder answer = new StringBuilder();
        //올림하는 기준
        int stand = 0;
        
        //이진수의 마지막 인덱스부터 순회
        int b1 = bin1.length()-1;
        int b2 = bin2.length()-1;
        
        while(b1 >= 0 || b2 >= 0){
            int sum = stand;
            
            //뒤에서부터 앞으로 이동
            if(b1 >= 0){
                sum += bin1.charAt(b1--) - '0';
            }
            if(b2 >= 0){
                sum += bin2.charAt(b2--) - '0';
            }
            
            answer.insert(0, sum %2); //현재자리
            stand = sum/2; //다음자리
        }
        //반복문이 끝난 후에도 이월된 숫자가 남아있다면     
        if(stand > 0){
            answer.insert(0, stand);
        }
        
        return answer.toString();
    }
}