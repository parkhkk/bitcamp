// 메서드 : 리팩토링
package step06;

import java.util.Scanner;

public class Exam02_2 {

    // 1) 함수1 : 리턴값(x), 파라미터(x)
    // => 함수 블록을 실행할 때 특정 값을 함수에 넘겨 줄 필요가 없고,
    //    함수 블록 실행을 완료한 후 어떤 값더 돌려주지 않는다.
    static void hello(String name, int age) {
        System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
    }

    public static void main(String[] args) {

        System.out.println("main()11111");
        
        hello("홍길동", 20); 
        
        System.out.println("main()22222");

        hello("임꺽정", 30);

        System.out.println("main()33333");

        hello("유관순", 16);

        System.out.println("main()44444");
    }
}