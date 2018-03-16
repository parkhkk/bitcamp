// 메서드 : 리팩토링
package step06;

import java.util.Scanner;

public class Exam02_5 {

    static void hello(String... names) {
        for (int i = 0; i < names.length; i++){
            System.out.printf("%s님 반갑습니다.", names[i]);
        }
    }

    public static void main(String[] args) {

        hello();
        System.out.println("----------------------------------");
        hello("홍길동");
    }
}