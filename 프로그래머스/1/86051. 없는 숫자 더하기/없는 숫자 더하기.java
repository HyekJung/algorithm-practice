import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer>list = new ArrayList();
        //리스트에 배열 원소 넣기
        for(int num: numbers){
            list.add(num);
        }
        
        for(int i=0; i<10; i++){
            if(!list.contains(i)){
                answer+=i;
            }
        }
        return answer;
    }
}