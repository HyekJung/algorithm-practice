class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width_max = 0;
        int heigth_max = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int width = Math.max(sizes[i][0], sizes[i][1]); //가로, 세로 중 큰 수 판별
            int height = Math.min(sizes[i][0], sizes[i][1]); // 작은 수 판별
            
            width_max = Math.max(width, width_max); //원소 중 가장 큰 수
            heigth_max = Math.max(height, heigth_max); //세로 중 가장 큰 수 - 모든 카드가 수용될 최소 크기
        }
        
        return width_max * heigth_max;
    }
}