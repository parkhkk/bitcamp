package step03.assignment;

public class test01 {
    public static void main(String[] agrs){
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
      
        step03.Score[] scores = new step03.Score[3];
        
        for (int i =0; i < scores.length; i++) {
        scores[i] = new step03.Score();
        
        System.out.print("입력? ");
        scores[i].name = sc.next();
        scores[i].kor = sc.nextInt();
        scores[i].eng = sc.nextInt();
        scores[i].math = sc.nextInt();
        scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
        scores[i].ave = scores[i].sum/3;
        }

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%s %3d %3d %3d %3d %5.1f\n", scores[i].name, scores[i].kor, scores[i].math, scores[i].eng, scores[i].sum, scores[i].ave);   
        }
    }
}