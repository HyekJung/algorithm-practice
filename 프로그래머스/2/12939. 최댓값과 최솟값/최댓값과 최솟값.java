class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        
        //최댓값, 최솟값 분별을 위한 반복문
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, Integer.parseInt(arr[i]));
            min = Math.min(min, Integer.parseInt(arr[i]));
        }
        answer += min + " ";
        answer += max;
        
        
        return answer;
    }
}