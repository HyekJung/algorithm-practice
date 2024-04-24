import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        char[] arr = my_string.toCharArray();
        
        //문자별 갯수 확인
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        //대문자
        for(char big = 'A'; big <= 'Z'; big++){
            list.add(map.getOrDefault(big, 0));
        }

        //소문자
        for(char small = 'a'; small <= 'z'; small++){
            list.add(map.getOrDefault(small, 0));
        }

        return list;  
    }
}