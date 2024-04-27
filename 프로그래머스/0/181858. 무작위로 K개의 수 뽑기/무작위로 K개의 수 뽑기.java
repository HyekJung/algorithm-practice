import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        HashSet<Integer> selected = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!selected.contains(num)) { // 선택된 숫자가 아니면 결과 배열에 추가
                result.add(num);
                selected.add(num);
                if (result.size() == k) // 결과 배열의 길이가 k와 같으면 종료
                    break;
            }
        }
        
        // 결과 배열의 길이가 k보다 작으면 나머지 값을 -1로 채움
        while (result.size() < k) {
            result.add(-1);
        }
        
        // 결과 배열을 int 배열로 변환하여 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}