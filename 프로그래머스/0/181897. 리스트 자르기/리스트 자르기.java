import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            return Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, a, b + 1);
        } else { // n == 4
            int count = 0;
            
            for (int i = a; i <= b; i += c) {
                count++;
            }
            int[] result = new int[count];
            int index = 0;
            
            for (int i = a; i <= b; i += c) {
                result[index++] = num_list[i];
            }
            return result;
        }
    }
}