class Solution {
    public int solution(int[][] board) {
        //0의 수 count        
        int cnt=0;
        
        //지뢰판 순회
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                //지뢰 없는 지역
                if(board[i][j]==0){
                    //상하 3칸
                    for(int di = -1; di<=1; di++){
                        //좌우 3칸
                        for(int dj = -1; dj<=1; dj++){
                            //주변 위치
                            int ei = i+di;
                            int ej = j+dj;
                            
                            //경계선을 넘으면 해당 구문 넘어감
                            if(ei<0||ei>=board.length||ej<0||ej>=board.length){
                                continue;
                            }
                                    
                            //모두 1로 바꾸기
                            board[ei][ej] = 1;
                        }
                    }
                }
            }
        }
        
        // 0인 값 찾아 cnt 증가
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
