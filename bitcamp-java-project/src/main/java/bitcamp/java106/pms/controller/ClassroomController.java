// 팀 관련 기능을 모아 둔 클래스
package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.util.Console;

public class ClassroomController {

    Scanner keyScan;
    ClassroomDao classroomDao;
    
    public ClassroomController(Scanner scanner, ClassroomDao classroomDao) {
        this.keyScan = scanner;
        this.classroomDao = classroomDao;
    }

    public void service(String menu, String option) {
        if (menu.equals("classroom/add")) {
            this.onClassroomAdd();
        } else if (menu.equals("classroom/list")) {
            this.onClassroomList();
        } else if (menu.equals("classroom/update")) {
            this.onClassroomUpdate();
        } else if (menu.equals("classroom/delete")) {
            this.onClassroomDelete();
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onClassroomAdd() {
        System.out.println("[수업 등록]");
        Classroom classroom = new Classroom();

        System.out.print("수업명? ");
        classroom.setName(this.keyScan.nextLine());

        System.out.print("시작일? ");
        classroom.setStartDate(Date.valueOf(this.keyScan.nextLine()));

        System.out.print("종료일? ");
        classroom.setEndDate(Date.valueOf(this.keyScan.nextLine()));
        
        System.out.print("교실번호?");
        classroom.setNum(this.keyScan.nextLine());
        
        classroomDao.insert(classroom);
    }

    void onClassroomList() {
        System.out.println("[수업 목록]");
        Classroom[] list = classroomDao.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%s, %s ~ %s, %s\n", 
                    list[i].getName(), 
                    list[i].getStartDate(), 
                    list[i].getEndDate(),
                    list[i].getNum());
        }
    }

    void onClassroomUpdate() {
        System.out.println("[수업 정보 변경]");
        System.out.print("변경할 수업의 번호? ");
        int classroomNo = Integer.parseInt(keyScan.nextLine());
        
        Classroom originClassroom = classroomDao.get(classroomNo);
        if (originClassroom == null) {
            System.out.printf("'%d번 수업을 찾을 수 없습니다.\n", classroomNo);
            return;
        }
        Classroom classroom = new Classroom();
        classroom.setNo(originClassroom.getNo());
        
        System.out.printf("수업명(%s)? ", originClassroom.getName());
        String str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setName(originClassroom.getName());
        } else {
            classroom.setName(str);
        }
        
        System.out.printf("시작일(%s)? ", originClassroom.getStartDate());
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setStartDate(originClassroom.getStartDate());
        } else {
            classroom.setStartDate(Date.valueOf(str));
        }
        
        System.out.printf("종료일(%s)? ", originClassroom.getEndDate());
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setEndDate(originClassroom.getEndDate());
        } else {
            classroom.setEndDate(Date.valueOf(str));
        }
        
        System.out.printf("교실번호(%s)? ", originClassroom.getNum());
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setNum(originClassroom.getNum());
        } else {
            classroom.setNum(str);
        }
        
        if (Console.confirm("변경하시겠습니까?")) {
            classroomDao.update(classroom);
            System.out.println("변경하였습니다.");
        } else {
            System.out.println("취소하였습니다.");
        }
    }

    void onClassroomDelete() {
        System.out.println("[팀 작업 삭제]");
        System.out.print("삭제할 작업의 번호? ");
        int classroomNo = Integer.parseInt(keyScan.nextLine());
        
        Classroom classroom = classroomDao.get(classroomNo);
        if (classroom == null) {
            System.out.printf(" %d번 수업을 찾을 수 없습니다.\n", classroomNo);
            return;
        }
        
        if (Console.confirm("삭제하시겠습니까?")) {
            classroomDao.delete(classroom.getNo());
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("취소하였습니다.");
        }
    }
    
}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 15 - ClassroomDao를 생성자에서 주입 받도록 변경.
// ver 14 - ClassroomDao를 사용하여 팀 데이터를 관리한다.
// ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.