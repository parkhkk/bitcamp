// 오버라이딩(overriding) - 응용 예 equals()
package step11.ex11;

public class Exam09_2 {

    static class Member /*extends Object*/{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Object 로 부터 상속 받은 equlas() 메서드를 
        // Member 클래스에 역할에 맞게 재 정의해보자!
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Member)) 
                return false;
            Member other = (Member) obj;
            
            if (!this.name.equals(other.name))
                return false;
            
            if (this.age != other.age)
                return false;
            
            return true;
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
        
    }
}
// 결론
// => Object로 부터 상속 받은 기본 메서드인 equals()는
//    같은 인스턴스 인지 비교하는 메서드이다.
// => 인스턴스의 데이턱 ㅏ같은지를 비교하고 싶다면, 이 메서드를 재정의(오버라이딩) 해야한다.
// => 오버라이딩의 예 :
//    String, 








