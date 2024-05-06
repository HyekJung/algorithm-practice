class Solution {
    public int[] solution(int n, int m) {
        int min = getMin(n, m); // 최대공약수
        int max = (n * m) / min; // 최소공배수
        
        int[] answer = {min, max};
        return answer;
    }
    
    //유클리드 호제법 최대공약수
    public int getMin(int n, int m){
        while(m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
}