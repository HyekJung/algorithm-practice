class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int cnt=0;
        //지뢰판 순회
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                //지뢰 없는 지역
                if(board[i][j]==0){
                    cnt++;// 안전한 지역일 때 칸수 증가
                    //상하 3칸
                    for(int di = -1; di<=1; di++){
                        //좌우 3칸
                        for(int dj = -1; dj<=1; dj++){
                            //주변 위치
                            int ei = i+di;
                            int ej = j+dj;
                            
                            //경계선을 넘으면 해당 구문 넘어감
                            if(ei>=0&&ei<board.length&&ej>=0&&ej<board.length){
                                //경계선 안쪽이면서 지뢰가 있을 때
                                if(board[ei][ej]==1){
                                    cnt--;// 안전한 지역 감소
                                }
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
