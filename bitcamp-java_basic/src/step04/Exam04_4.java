// 비트 이동 연산자 : >>, >>>, << 
package step04;

public class Exam04_4 {
    public static void main(String[] args) {
        int i = 0x27a130ff;
        int a, b, c, d;
        
        System.out.println(Integer.toHexString(i));

        // i 변수에 들어있는 값을 1바이트씩 짤라서 16진수로 출력하라!
        a = i >> 24;
        b = (i >> 16) & 0xff;
        c = (i >> 8) & 0xff; 
        d = i & 0xff;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
    }
}
