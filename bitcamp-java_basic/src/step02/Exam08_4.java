// 형변환 - 부동소수점 변수의 값을 정수변수에 저장

package step02;

public class Exam08_4 {
    public static void main(String[] args) {
        
        float f = 3.14f;
        double d = 9876.56789; 

        int i = (int)f;
        long l = (long)d;

        System.out.println(i);
        System.out.println(l);
        
    }
}

