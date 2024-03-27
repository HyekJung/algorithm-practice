class Solution {
    public int solution(int[][] board) {
        int cnt=0;
        
        //지뢰판 순회
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                //지뢰 없는 지역
                if(board[i][j]==0){
                    boolean safe = true; //안전한 구역
                    //상하 3칸
                    for(int di = -1; di<=1; di++){
                        //좌우 3칸
                        for(int dj = -1; dj<=1; dj++){
                            //주변 위치
                            int ei = i+di;
                            int ej = j+dj;
                            
                            //경계선 안쪽에 있지만, 지뢰인 경우
                            if(ei>=0&&ei<board.length&&ej>=0&&ej<board.length&&board[ei][ej]==1){
                                safe = false;// 안전한 지역 아님
                                break; //안전한 지역이 아니면 반복할 이유 없으므로
                            }
                        }
                        if(!safe){
                            break;
                        }
                    }
                    if(safe){
                        cnt++;//안전한 구역이면 카운트 증가
                    }
                }
            }
        }
        return cnt;
    }
}