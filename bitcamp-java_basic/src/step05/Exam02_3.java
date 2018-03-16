// 흐름 제어문 - if = else if ~ else if ~ else
package step05;

import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {
       Scanner keyScan = new Scanner(System.in);
       System.out.print("사용자 레벨 ?");
       int level = keyScan.nextInt();
       
        // 상수를 사용하지 않았을때
        // => 값의 의미를 주석으로 달아야만 다른 개발자가 이해할 수 있다.
        switch (level){
        case 0: //손님
            System.out.println("조회만 가능합니다.");
        case 1: // 일반회원
            System.out.println("글작성 가능합니다.");
        case 2: // 관리자
            System.out.println("다른 회원의 글도 변경, 삭제 할 수 있습니다.");
            break;
        }

       
    }
}