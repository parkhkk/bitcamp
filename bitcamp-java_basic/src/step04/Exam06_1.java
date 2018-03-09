// 비트 이동 연산자 : 응용 III
package step04;

public class Exam06_1 {
    public static void main(String[] args) {
        int i = 2;

        int result = i++ + i++ * i++;

        System.out.printf("%d, %d\n", i, result);


    }
}
