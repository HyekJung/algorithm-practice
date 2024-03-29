import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = numbers.split("");
        
        HashMap<String, String> map = new HashMap<>();
        //숫자에 맞는 영어 넣기
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        //문자열을 숫자로 변환
        for(String key: map.keySet()){
            numbers = numbers.replaceAll(key, map.get(key));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}