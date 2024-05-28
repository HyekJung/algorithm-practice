import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        TreeMap<Character, List<String>> map = new TreeMap<>();
        ArrayList<Character> lists = new ArrayList<>();
        
        for (String string : strings) {
            char key = string.charAt(n);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(string);
        }
        
        for (char key : map.keySet()) {
            lists.add(key); // 순서 넣기
        }
        
        int i = 0;
        for (char key : lists) {
            List<String> values = map.get(key);
            Collections.sort(values); // 동일한 키에 대해 사전순 정렬
            for (String value : values) {
                answer[i++] = value;
            }
        }
        
        return answer;
    }
}