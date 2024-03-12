import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        HashMap<String, String> map = new HashMap<>();
        String answer = "";
        
        // 알파벳에 대응하는 모스 부호를 저장한 배열
        String[] morse = { 
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        
        // 알파벳 배열을 생성하고 각각의 모스 부호와 대응하는 알파벳을 HashMap에 저장
        char alphabet = 'a';
        for (String m : morse) {
            map.put(m, String.valueOf(alphabet));
            alphabet++;
        }
        
        // 주어진 문자열을 모스 부호로 분리
        String[] let = letter.split(" ");
        
        // 각 모스 부호에 해당하는 알파벳을 찾아 결과 문자열에 추가
        for (String m : let) {
            if (map.containsKey(m)) {
                answer += map.get(m);
            }
        }
        
        return answer;
    }
}