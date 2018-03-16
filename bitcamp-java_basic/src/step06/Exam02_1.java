// 메서드 : 리팩토링
package step06;

import java.util.Scanner;

public class Exam02_1 {

    // 1) 함수1 : 리턴값(x), 파라미터(x)
    // => 함수 블록을 실행할 때 특정 값을 함수에 넘겨 줄 필요가 없고,
    //    함수 블록 실행을 완료한 후 어떤 값더 돌려주지 않는다.
    static void hello() {
        System.out.println("안녕하세요!");
        System.out.println("이 메서드는 어떤값도 리턴하지 않습니다.");
    }

    public static void main(String[] args) {
        hello();
        System.out.println("실행완료!");
    }
}