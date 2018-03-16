package step05.assignment;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int count = keyScan.nextInt();
        int i = 1;

        while(i < count) {
            int j = 1;
            int k = (count - i) / 2 ;
            while(j < k) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i += 2;
        }
        
    }
}