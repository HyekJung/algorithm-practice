import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int move: moves){
            //인덱스는 0부터 시작
            int col = move-1;
            
            // 인협뽑기 시작
            for(int row=0; row<board.length; row++){
                int doll = board[row][col];
                //해당 위치에 인형이 있다면
                if(board[row][col]!=0){
                    //인형 뽑기
                    board[row][col] = 0;
                    //뽑은 인형 바구니로
                    basket.push(doll);
                }
                //바구니가 비어있지 않고, 바구니의 첫번째 요소와 doll이 같다면
                if(!basket.isEmpty()&&doll==basket.peek()){
                    //같은 두 인형 소멸
                    answer+=2;
                    
                    //실제로도 소멸
                    //첫번째 인형
                    basket.pop();
                    //스택이 비어있지 않으면
                    if(!basket.isEmpty()){
                        //두번째 인형
                        basket.pop();
                    }
                }
            }
        }
        return answer;
    }
}
