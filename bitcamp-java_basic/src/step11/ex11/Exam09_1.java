// 오버라이딩(overriding) - 응용 예 
package step11.ex11;

public class Exam09_1 {

    static class Member /*extends Object*/{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        // Object 클래스?
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
        
        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }
        
        System.out.println(m1.equals(m2));
        //    Member 클래스에 equals()를 정의한 적이 업슨ㄴ데 컴파일 오류가 발생하지 않네?
        // => 클래스를 만들 때 수퍼 클래스를 지정하지 않으면,
        //    자동으로 object를 상속받게 된다.
        //    따라서 자바의 모든 클래스는 Object의 자손이다.
        // => 자바의 모든 클래스는 Object의 메서드를 사용할 수 있다.
        //    equals()
        // 상속받은 메서드 중에서 equals() 메서드를 상펴보자.
        // equals() 는 String 클래스에서 문자열 비교에 사용했던 메서드이다.
        // 두 문자열의 인스턴스가 달라도 내용이 같으면 true를 리턴했다.
        // 그런데 위의 실행 결과를 보면 m1 과 m2 가 비록 인스턴스는 다르지만
        // 내용이 같기 때문에 true 를 리턴할 것이라 예상했는데 
        // 실제 리턴 값을 확인해보면 false 를 리턴한다.
        // 이유 ?
        // => Object 클래스에서 상속받아 쓰는 equals() 는 원래 내용물을 비교하는게 아니라 
        //    인스턴스가 가틍ㄴ지를 비교하는 메서드이다 .
        // => m1, m2 인스턴스가 다르니 당연히 결과가 false 인 것이다.
        // Member의 내용이 같은지 비교하고 싶은가?
        // => 이럴 때 "오버라이딩" 을 사용하는 것이다.
        // => Object로 부터 상속 받은 메서드가 Member 클래스에 맞지 않다.
        //    그럼 Member 클래스에 맞게끔 재 정의하면 되는 것이다.
        
    }
}








