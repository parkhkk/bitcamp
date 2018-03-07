// 형변환 - 부동소수점 변수의 값을 정수변수에 저장

package step02;

public class Exam08_7 {
    public static void main(String[] args) {
        
        char ch;
        int i = 0x41;
        ch = (char)i;

        boolean bool;
        bool = (boolean) 1;

        boolean b1 = (boolean)"true";
        char v2 = (char)"가";
        int v3 = (int)"123";
        float v4 = (int) "3.14f";
    }
}

