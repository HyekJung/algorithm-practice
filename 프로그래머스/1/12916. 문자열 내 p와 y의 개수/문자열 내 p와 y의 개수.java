class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //모두 소문자로 변환
        String lowerStr = s.toLowerCase();
        //개수
        int p = 0;
        int y = 0;
        
        //개수 세기
        for(int i = 0; i<lowerStr.length(); i++){
            char str = lowerStr.charAt(i);
            if(str == 'p'){
                p++;
            }else if(str == 'y'){
                y++;
            }
        }
        
        if(p == y){ //개수가 같고
            answer = true;
        }else{// 다르면
            answer = false;
        }

        return answer;
    }
}