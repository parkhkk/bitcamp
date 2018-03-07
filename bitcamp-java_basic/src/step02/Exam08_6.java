// 형변환 - 부동소수점 변수의 값을 정수변수에 저장

package step02;

public class Exam08_6 {
    public static void main(String[] args) {
        
        byte b =100;
        short s = 100;
        int i = 100;
        long l = 100;

        byte b2 = (byte)s;
        System.out.println(b2);
       
        b2 = (byte)i;
        System.out.println(b2);
       
        b2 = (byte)l;
        System.out.println(b2);

        long l2 = 10000000000000L;
        int i2 = (int)l2;

        System.out.println(i2);
    }
}

