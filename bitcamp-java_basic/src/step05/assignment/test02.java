package step05.assignment;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int count = keyScan.nextInt();
        int i = 0;

        while(i < count) {
            int j = 0;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = count - 1;
        while(i >= 1) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        
    }
}