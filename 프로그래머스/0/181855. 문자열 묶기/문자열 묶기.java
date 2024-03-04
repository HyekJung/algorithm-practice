import java.util.HashMap;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(String arr:strArr){
            map.put(arr.length(),map.getOrDefault(arr.length(),0)+1);
        }
        int mapMax = 0;
        for(int mapGet: map.values()){
            mapMax = Math.max(mapMax,mapGet);
        }
        return mapMax;
    }
}