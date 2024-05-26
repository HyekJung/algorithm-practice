import java.util.*;

class Solution {
    public ArrayList solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(isZeroFive(i)){ //5와 0으로 이루어져있으면
                answer.add(i); //원소 추가
            }
        }
        if(answer.size() == 0){ //없으면 
            answer.add(-1); //-1
        }
        return answer;
    }
    
    private boolean isZeroFive(int word){
        String num = String.valueOf(word); //string 변환
        char[] chArray = num.toCharArray(); // 5,0 포함여부를 확인하기 위한 배열
        
        for(int i = 0; i < chArray.length; i++){
            if(chArray[i] != '5' && chArray[i] != '0'){
                return false; // 5와 0이 아니면 false
            }
        }
        return true;
    }
}