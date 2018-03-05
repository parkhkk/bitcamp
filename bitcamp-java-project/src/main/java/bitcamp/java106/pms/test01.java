package bitcamp.java106.pms;

public class test01 {
    public static void main(String[] args) {
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.println("이름? ");
        String name = keyScan.next();

        System.out.println("국어? ");
        int kor = keyScan.nextInt();

        System.out.println("수학? ");
        int mat = keyScan.nextInt();

        System.out.println("영어? ");
        int eng = keyScan.nextInt();

        int sum = kor + mat + eng;
        float avg = sum/3; 

        System.out.println("이름 : "+name);
        System.out.println("국어 : "+kor);
        System.out.println("수학 : "+mat);
        System.out.println("영어 : "+eng);
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+avg);
    }
}