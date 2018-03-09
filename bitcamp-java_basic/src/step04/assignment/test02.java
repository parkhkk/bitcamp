package step04.assignment;


public class test02 {
    public static void main(String[] agrs){
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        team[] teams = new team[100];

        member[] members = new member[100];

        for (int y = 0; y <members.length; y++) {
            members[y] = new member();

            System.out.print("이름 ? ");
            members[y].name = sc.next();

            System.out.print("이메일 ? ");
            members[y].mail = sc.next();

            System.out.print("암호 ? ");
            members[y].pass = sc.nextInt();
        }
        
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
            
        }

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < teams.length; i++) {
            System.out.printf("%s %2d %10s ~ %10s\n", teams[i].name, teams[i].num, teams[i].st, teams[i].fn);   
        }
    }
}