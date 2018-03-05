// 정수 

package step02;

public class Exam04_2 {
    public static void main(String[] args) {
        int i = 100;
        byte b = 100;

        // i 변수에 들어 있는 값이 byte 메모리에 저장할 수있을 지라도,
        // 리터럴이 아닐 경우에는 큰 크기의 메모리 값을
        // 작은 크기의 메모리에 저장할 수 없다.
        // 리터럴에 대해서만 예외를 허용한다.
        // b = i; 컴파일 오류 !

        short s = 100;
        // s = i; 컴파일 오류 !

        int j = 100;
        j = i ;

        long l = 100;
        l = i;

        int k;
        // k = l; 컴파일 오류
    }
}

