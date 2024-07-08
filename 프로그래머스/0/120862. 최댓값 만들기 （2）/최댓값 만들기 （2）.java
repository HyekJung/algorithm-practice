import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers); //오름차순 정렬
        
        int len = numbers.length;
        int max = numbers[len - 1] * numbers[len - 2];
        int min = numbers[0] * numbers[1];
                            
        return Math.max(max, min);
    }
}