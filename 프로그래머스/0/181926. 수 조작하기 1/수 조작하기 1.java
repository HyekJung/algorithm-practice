class Solution {
    public int solution(int n, String control) {
        int i = 0;
        char[] arr = control.toCharArray();
        
        while(i < arr.length){ //반복 조건 - 배열의 끝까지 순회
            switch(arr[i]){
                case 'w' : n += 1; break;
                case 's' : n -= 1; break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
            i++; //i값 증가
        }
        return n;
    }
}