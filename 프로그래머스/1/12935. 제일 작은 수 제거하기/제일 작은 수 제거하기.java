import java.util.ArrayList;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList list = new ArrayList();
        if(arr.length<=1){
            list.add(-1);
        }else{
            int min = arr[0];
            for(int i=0; i<arr.length; i++){
                list.add(arr[i]);
                if(min>arr[i]){
                    min = arr[i];
                }
            }
            list.remove(list.indexOf(min));
        }
        return list;
    }
}