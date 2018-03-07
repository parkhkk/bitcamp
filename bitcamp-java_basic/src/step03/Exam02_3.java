package step03;

public class Exam02_3 {
     public static void main(String[] args){

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float ave;
        }
      
        Score[] arr = new Score[3];

        for (int i = 0; i < arr.length; i++){
        arr[i] = new Score();
        }

        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        // 반복문을 사용하면 배열의 인스턴스 값을 꺼내기 쉽다.
        for (int i = 0; i < arr.length; i++){
        System.out.printf("이름 : %s\n", arr[i].name);
        }       

     }
}