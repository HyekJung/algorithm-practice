class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        
        int x = (total - (num * (num - 1) / 2)) / num;
        
        for (int i = 0; i < num; i++) {
            result[i] = x + i;
        }
        
        return result;
    }
}