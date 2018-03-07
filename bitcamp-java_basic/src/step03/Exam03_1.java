// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1 {
     public static void main(String[] args){

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float ave;
        }


        // Score 인스턴스 선언
        Score s1;

        // 인스턴스를 만들어 그 주소를 레퍼런스에 저장한다.
        s1 = new Score();

        // 인스턴스를 새로 만들러 s1에 주소를 저장한다 
        // 기존에 들어있던 주소는 잃어 버린다.
        s1 = new Score();
     }
}