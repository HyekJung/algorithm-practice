class Solution {
    public int solution(int n, int k) {
        int yang = 12000;
        int drink = 2000;
        int service = n/10;
        
        return yang*n+drink*k-drink*service;
    }
}