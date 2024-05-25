class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" \\+ ");
        int sum = 0;
        int num = 0;
        
        for(String pol : str){
            if(pol.equals("x")){
                sum += 1;
            }else if(pol.endsWith("x")){ // x로 끝나는 항일 때
                int coefficient = 1;
                if(pol.length() > 1) {
                    coefficient = Integer.parseInt(pol.replace("x", ""));
                }
                sum += coefficient;
            }else{ // 상수일 때
                num += Integer.parseInt(pol);
            }
        }
        
        if(sum != 0){ // 0x가 아닐 때
            if(sum > 1){
                answer += sum + "x";
            }else{
                answer += "x";
            }

        }
        if(num != 0){ // 상수에 값이 있을 때
            if(!answer.isEmpty()){ // answer에 값이 있으면 덧셈 부호 추가
                answer += " + ";
            }else{
                answer += "";
            }
            answer += num;
        }

        return answer;
    }
}