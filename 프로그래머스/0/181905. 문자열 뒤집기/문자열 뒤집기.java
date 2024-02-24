class Solution {
    public String solution(String my_string, int s, int e) {
        String mid = my_string.substring(s,e+1);
        String reMid = "";
        String answer = "";
        
    	for (int i = mid.length()-1; i>=0; i--) {
    		reMid += mid.charAt(i);
    	}
    	answer = my_string.replace(mid,reMid);
    	
        return answer;
    }
}