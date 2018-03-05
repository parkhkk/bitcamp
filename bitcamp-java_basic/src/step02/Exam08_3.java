// 형변환 - 정수 변수와 부동 소수점 변수

package step02;

public class Exam08_3 {
    public static void main(String[] args) {
        
        byte b = 100;
        short s = 100;
        int i = 12345678;
        long l = 12345678;
        char c = 100;
        
        float f;
        double d; 
        
        // 정수 변수의 값을 부동 소수점 변수에 저장할 때 
        // 값이 짤릴 수 있다.
        f = b; // byte(2byte) ==> float(4byte)
        System.out.println(f);
        f = s; // short(2) ==> float(4)
        System.out.println(f);
        f = i; // int (4) ==> float(4)
        System.out.println(f);
        f = l; // long(8) ==> float(4)
        System.out.println(f);

        d = i; // int(4byte) ==> double(8byte)
        System.out.println(d);
        d = l; // long(8) ==> double(8)
        System.out.println(d);
    }
}

