import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){ // 배열안의 원소와 c가 같으면
                stack.pop(); //중복되니 빼기
            }else{
                stack.push(c); // 배열안의 원소가 없거나 c와 같지 않다면 원소넣기
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}