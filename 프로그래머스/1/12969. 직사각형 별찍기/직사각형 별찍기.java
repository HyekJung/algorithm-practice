import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //반복문을 통한 별찍기
        //열
        for(int i=0; i<b; i++){
            //행
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}