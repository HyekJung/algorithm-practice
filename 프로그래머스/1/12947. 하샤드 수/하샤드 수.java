class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = x+"";
        String []arr = str.split("");
        int num = 0;
        for(int i=0; i<arr.length; i++){
            num+=Integer.parseInt(arr[i]);
        }
        if(x%num==0){
            answer=true;
        }
        return answer;
    }
}