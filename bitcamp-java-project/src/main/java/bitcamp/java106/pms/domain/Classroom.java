package bitcamp.java106.pms.domain;

import java.sql.Date;


public class Classroom {
    private int no;
    private String name;
    private Date startDate;
    private Date endDate;
    private String num;
    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }
    
    
}

//ver 17 - getMember() 메서드 추가. 
//         toString() 오버라이딩. 
//ver 16 - 캡슐화 적용. 겟터, 셋터 추가.
//ver 15 - 멤버를 저장할 인스턴스 변수를 추가한다.
//          팀 멤버 배열에 멤버 객체를 추가하고 빼는 메서드를 새로 정의한다.
//ver 13 - 시작일, 종료일의 데이터 타입을 String에서 Date으로 변경