import java.util.*;

class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        int start = 0;
        
        //start가 문자열의 길이까지만 반복하는데
        while(start < my_str.length()){
            //자를 끝의 인덱스 - 배열의 길이보다 넘어가지 않게 설정
            int end = Math.min(start+n, my_str.length());
            
            //i부터 n길이만큼 자르기
            list.add(my_str.substring(start, end));
            start+=n;
        }
        return list;
    }
}