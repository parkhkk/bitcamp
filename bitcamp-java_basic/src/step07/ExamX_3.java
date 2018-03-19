// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;


public class ExamX_3 {
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입을 사용하는 방법
        // => new 명령을 사용하여 설계도에 기순된 대로 메모리를 준비한다.
        // => 메모리는 heap 영역에 생성된다.
        // => 메모리 주소를 레퍼런스(주소 변수)에 저장한다.
        Score3 score = new Score3();
        // 클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        // 다음은 Score의 값을 다루는 연산자가 없을 때의 예이다.
        // => non-instance 메서드 = static 메서드 = 클래스 메서드
        /*
        Score2.calculate(score);
        */
        
        // 클래스 메서드를 사용할 때마다 매번 인스턴스의 주소를 파라미터로 넘겨줘야 했다.
        // 그러나 인슨턴스 메서드를 사용하는 순간 파라미터가 아닌 
        // 메서드 앞에 인스턴스 주소를 준다.
        score.calculate(); // 변수 뒤에 연산자를 놓는 i++ 의 예와 비슷하다.
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                score.name, score.kor, score.eng, score.math, 
                score.sum, score.avg);
    }
}
// 사용자 정의 데이터 타입에서 인슨턴스의 값을 다루는 연산자를 정의할 때는 
// 인스턴스 메서드롤 만드는 것이 사용하기 편하다!