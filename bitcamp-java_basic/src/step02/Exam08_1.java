// 형변환 - 암시적 형 변환

package step02;

public class Exam08_1 {
    public static void main(String[] args) {
        
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        char c = 100;

        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;
        System.out.println(b);

        // 큰 메모리의 값을 작은 메모리에 넣을 수 없다.
        // b2 = s;
        // s2 = i;
        // i2 = l;
        // c2 = s; // 같은 2 바이트라도 유효한 값의 범위다 다르다.
    }
}

