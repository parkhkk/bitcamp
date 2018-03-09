package step04.assignment;

import javax.lang.model.util.ElementScanner6;

public class App {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
           
        int i =0;
        team[] teams = new team[100];
        
        int y = 0;
        member[] members = new member[100];

        while (true) {
            System.out.print("명령>");
            String command = sc.nextLine();
        
            
            if (command.equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
            }
            else if (command.equals("team/add")) {
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
                i++;
            }
            else if (command.equals("team/list")) {
                for (i = 0; i < teams.length; i++) {
                    System.out.printf("%s, %2d, %10s ~ %10s\n", teams[i].name, teams[i].num, teams[i].st, teams[i].fn);   
                }
            }
            else if (command.equals("member/add")) {
                members[y] = new member();

                System.out.print("이름 ? ");
                members[y].name = sc.next();

                System.out.print("이메일 ? ");
                members[y].mail = sc.next();

                System.out.print("암호 ? ");
                members[y].pass = sc.nextInt();
            }
            else if (command.equals("member/list")) {
                for (y = 0; y < members.length; y++) {
                    System.out.printf("%s %s %d\n", members[y].name, members[y].mail, members[y].pass);   
                }
            }
            else if (command.equals("quit")) {    
            System.out.println("안녕히가세요!");            
            break;                                          
            }
            else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
        }
    }
}
