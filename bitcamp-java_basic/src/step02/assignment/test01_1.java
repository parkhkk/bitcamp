package step02.assignment;

public class test01_1 {
    public static void main(String[] args) {
        
        
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.println("팀명? ");
        String team = keyScan.next();

        System.out.println("설명? ");
        String aa = keyScan.next();

        System.out.println("최대인원? ");
        int num = keyScan.nextInt();

        System.out.println("시작일? ");
        String st = keyScan.next();

        System.out.println("종료일? ");
        String fn = keyScan.next();

        System.out.println("----------------------------------------------");
        System.out.println("팀명 : "+team);
        System.out.println("설명 : "+aa);
        System.out.println("최대인원 : "+num);
        System.out.print("일자 : " + st);
        System.out.print(" ~ " + fn);
       
    }
}