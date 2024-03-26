import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int move: moves){
            //인덱스는 0부터 시작
            int col = move-1;
            int doll = 0;
            
            // 인협뽑기 시작
            for(int row=0; row<board.length; row++){
                doll = board[row][col];
                //해당 위치에 인형이 있다면
                if(board[row][col]!=0){
                    //인형 뽑기
                    board[row][col] = 0;
                    break; //인형은 하나만 뽑으면 되므로
                }
            }
            
            //잡은 인형 바구니에 넣기 
            if(doll!=0){ //인형이 없는 곳에서 작동 시킬 경우를 제외
              //바구니가 비어있지 않고, 바구니의 첫번째 요소와 doll이 같다면
                if(!basket.isEmpty()&&doll==basket.peek()){
                    //아직 인형을 넣기전
                    basket.pop(); //기존 인형 없애기
                    answer+=2; // 없앤 인형 갯수 증가
                }else{
                    basket.push(doll); // 기존 바구니 요소와 doll이 다른 모양이면 넣기
                }
            }
        }
        return answer;
    }
}