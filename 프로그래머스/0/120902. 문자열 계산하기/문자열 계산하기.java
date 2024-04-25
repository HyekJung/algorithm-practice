class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]); //첫번째 자리 수 미리 넣기
        for(int i = 1; i < str.length-1; i++){
            if(str[i].equals("+")){ //부호가 덧셈이라면
                answer += Integer.parseInt(str[i+1]);
            }else if(str[i].equals("-")){ //부호가 뺄셈이라면
                answer -= Integer.parseInt(str[i+1]);
            }
        }
        return answer;
    }
}