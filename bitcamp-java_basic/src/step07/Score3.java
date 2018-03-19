// 사용자 저의 데이터 타입 - 인스턴스 메서드
package step07;

public class Score3 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avg;

    // 다음 연산자는 계산을 수행할 때마다 인슨턴스의 주소를 파라미터로 받아야 한다.
    public static void calculate(Score3 score) {
        score.sum = score.kor + score.eng + score.math;
        score.avg = score.sum / 3f;
    }
}
