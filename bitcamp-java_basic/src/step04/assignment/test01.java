package step04.assignment;


public class test01 {
    public static void main(String[] agrs){
        
        String answer;
        boolean yn;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        team[] teams = new team[2];
        
        for (int i =0; i < teams.length; i++) {
            teams[i] = new team();
            
            System.out.print("팀명 ? ");
            teams[i].name = sc.next();
            System.out.print("설명 ? ");
            teams[i].ex = sc.next();
            System.out.print("최대인원 ? ");
            teams[i].num = sc.nextInt();
            System.out.print("시작일 ? ");
            teams[i].st = sc.next();
            System.out.print("종료일 ? ");
            teams[i].fn = sc.next();
            System.out.print("계속 입력하시겠습니까?(Y/n)");
            answer = sc.next().trim().toLowerCase();
            if (answer.equals("y")) continue;
            else if (answer.equals("n")) break;
            

        }

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < teams.length; i++) {
            System.out.printf("%s %2d %10s ~ %10s\n", teams[i].name, teams[i].num, teams[i].st, teams[i].fn);   
        }
    }
}