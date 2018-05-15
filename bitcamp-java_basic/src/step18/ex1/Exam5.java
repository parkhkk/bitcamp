// Reflection API : 클래스 로딩과 "class"라는 스태틱 변수
package step18.ex1;

public class Exam5 {
    static class A {
        void m() {
            System.out.println("Hello!");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("step18.ex1.Exam5$A");
        
        A obj = (A)clazz.newInstance();
        obj.m();
    }

}





