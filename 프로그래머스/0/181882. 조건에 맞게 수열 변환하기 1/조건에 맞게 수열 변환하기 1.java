class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i]; // 모두 해당되지 않을 때
            
            if(arr[i] >= 50 && arr[i] % 2 == 0){ //50보다 크거나 같은 짝수
                answer[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i] % 2 == 1){ //50보다 작은 홀수
                answer[i] = arr[i] * 2;
            }

        }
        return answer;
    }
}