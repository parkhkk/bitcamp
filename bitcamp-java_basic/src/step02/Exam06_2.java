// 문자 변수 - UTF-16(Unicode 2) 코드 값 저장 

package step02;

public class Exam06_2 {
    public static void main(String[] args) {
        
        char c1, c2, c3;

        c1 = 0x41; // A 문자의 UTF-16 코드 값
        c2 = 65; // A 문자의 UTF-16 코드 값
        c3 = 0b0100_0001;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        char c4;
        c4 = '핳';
        System.out.println(c4);

    }
}

