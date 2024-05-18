import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] sort = new int[rank.length]; // 등수 배열을 담기 위한 sort생성
        List<Integer> list = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i < rank.length; i++){
            map.put(rank[i], i); //등수와 각 인덱스 넣기
            sort[i] = rank[i];
        }
        
        for(int j = 0; j < rank.length; j++){
            int current = rank[j]; //현재 등수
            if(attendance[j] == true){ //참석 여부가 true인 경우만
                list.add(current);
            }
        }
        
        Collections.sort(list); //오름차순 정렬(높은 등수 순서대로)
  
        int a = map.get(list.get(0));
        int b = map.get(list.get(1));
        int c = map.get(list.get(2));
        
        answer = 10000 * a + 100 * b + c;
        
        return answer;
    }
}