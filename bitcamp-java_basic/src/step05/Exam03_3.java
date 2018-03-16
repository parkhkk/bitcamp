// 흐름 제어문 - 중첩된 반복문 탈출
package step05;

import java.util.Scanner;


public class Exam03_3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;

        while (x < 9) {
            while (y <= 9) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);
               
                if (x == 5 && y == 5)
                    break;
               
                    y++;                
            }
            System.out.println();
            x++;
            y = 1; 
        }
    }
}