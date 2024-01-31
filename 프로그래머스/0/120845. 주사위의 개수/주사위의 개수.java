class Solution {
    public int solution(int[] box, int n) {
        int bottom = (box[0]/n)*(box[1]/n);
        int area = bottom*(box[2]/n);
        return area;
    }
}