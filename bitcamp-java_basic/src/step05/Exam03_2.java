// 흐름 제어문 - if = else if ~ else if ~ else
package step05;

import java.util.Scanner;


public class Exam03_2 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (sum <= 100) {
            count++;
            if (count % 2 == 0)
                sum += count;
        }
       System.out.printf("count=%d, sum=%d\n", sum, count);



       count = 0;
       sum = 0;
       while (count < 100) {
            count++;
            if (count % 2 == 1)
                continue;
            sum += count;
       }
       System.out.printf("count=%d, sum=%d\n", count, sum);

       count = 0;
       sum = 0;
       while (count < 100) {
            count++;
            if (count > 50)
                continue;
            sum += count;
       }
       System.out.printf("count=%d, sum=%d\n", count, sum);
    }
}