class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        // 패턴 문자열을 정수로 변환
        long target = Long.parseLong(p);
        
        // 주어진 문자열을 순회하면서 패턴과 비교
        for (int i = 0; i <= t.length() - len; i++) {
            // 부분 문자열을 정수로 변환하여 패턴과 비교
            long current = Long.parseLong(t.substring(i, i + len));
            if (current <= target) {
                answer++;
            }
        }
        
        return answer;
    }
}