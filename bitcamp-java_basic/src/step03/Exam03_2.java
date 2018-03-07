// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_2 {
     public static void main(String[] args){

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float ave;
        }

        Score s1 = new Score();

        Score s2 = s1; // s1 에 저장된 주소를 s2에 복사한다.

        s1.name = "홍길동";

        System.out.printf(s2.name);

     }
}