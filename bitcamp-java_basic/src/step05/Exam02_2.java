// 흐름 제어문 - if = else if ~ else if ~ else
package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam02_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("[지원부서]");
        System.out.println("1. S/W개발");
        System.out.println("2. 일반관리");
        System.out.println("3. 시설경비");
        System.out.println("지원 분야의 번호를 입력하세요 : ");
        int no = sc.nextInt();

        System.out.println("제출하실 서류는 다음과 같습니다.");
        switch(no) {

        case 1:
            System.out.println("정보처리자격증");
        case 2:
            System.out.println("졸업증명서");
        case 3:
            System.out.println("이력서");
            break;
        default:
            System.out.println("올바른 번호를 입력하세요 !");
        }           
    }
}