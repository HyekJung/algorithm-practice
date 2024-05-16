import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Float> avgs = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for(int[] scores : score){ // 평균값 구해서 배열에 넣기
            float avg = (float)((scores[0] + scores[1]) / 2.0);
            avgs.add(avg);
        }
        
        Collections.sort(avgs, Collections.reverseOrder()); //내림차순 정렬
        
        for(int i = 0; i < score.length; i++){
            int rank = 1;
            float current = (float)((score[i][0] + score[i][1]) / 2.0); //현재 학생들의 평균
            
            for(int j = 0; j < score.length; j++){
                if(avgs.get(j) == current){ //같은 점수일 경우
                    rank = j + 1;
                    break;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}