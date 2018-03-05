// 변수 - 변수 선언과 값 저장

package step02;

public class Exam03_4 {
    public static void main(String[] args) {
        // 모든 메모리를 준비한 후 값 저장하기
        // - 즉 모든 메모리를 준비한 후 값 저장하기
        int a1, a2;
        a1 = 100;
        a2 = 200;
        System.out.println(a1);
        System.out.println(a2);
        
        // 변수 선언과 동시에 값을 저장하기
        // - 메모리를 준비한 후 즉시 값으로 초기화시키기 
        int b1 = 100, b2 = 200;
        System.out.println(b1);
        System.out.println(b2);

        int c1 = 100, c2, c3 = 300, c4;
        System.out.println(c1);

        // 메모리를 준비한 후 단 한 번이라도 값을 넣은 후에 사용해야한다.
        // System.out.println(c2);
        
        System.out.println(c3);
        
        // System.out.println(c4);
        
    }
}

