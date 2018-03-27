package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Classroom;

public class ClassroomDao {
    Classroom[] classrooms = new Classroom[1000];
    int classroomIndex = 0;
    
    public void insert(Classroom classroom) {
        classroom.setNo(classroomIndex);
        this.classrooms[this.classroomIndex++] = classroom;
    }
    
    public Classroom[] list() {
        Classroom[] arr = new Classroom[this.classroomIndex];
        for (int i = 0; i < this.classroomIndex; i++) 
            arr[i] = this.classrooms[i];
        return arr;
    }
    
    public Classroom get(int classroomNo) {
        for (int i = 0; i < classroomIndex; i++) {
            if (classrooms[i] == null) continue;
            if (classrooms[i].getNo() == classroomNo) {
                return classrooms[i];
            }
        }
        return null;
    }
    
    public void update(Classroom classroom) {
        classrooms[classroom.getNo()] = classroom;
    }
    
    public void delete(int classroomNo) {
        classrooms[classroomNo] = null;
    }
    

}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - ClassroomController로부터 데이터 관리 기능을 분리하여 ClassroomDao 생성.





