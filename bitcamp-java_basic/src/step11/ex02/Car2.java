// 기존 코드를 복사하여 새 클래스를 만든 후에 코드를 복사했다.
package step11.ex02;

public class Car2 {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
    public Car2() {    }
    // 이전 프로그램에서 다음 생성자를 사용하기 때문에
    // 이 생성자에 파라미터를 덧 붙일 수는 없다.
    public Car2(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }
    
    public Car2(String model, String maker, int capacity,
                boolean sunroof, boolean auto) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
        this.sunroof = sunroof;
        this.auto = auto;
    }
}
