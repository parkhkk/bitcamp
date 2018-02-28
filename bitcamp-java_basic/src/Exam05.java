// 소스 파일과 바이트코드 파일을 분리하기
public class Exam05 {
    public static void main(String[] args) {
        System.out.println("Exam05");
    }
}
class G {}

/**
    소스 코드와 컴파일로 만드어진 바이트 코드 파일을 분리해 두면
    나중에 사용자에게 배포하는 파일을 만들 때 편리하다.
    그래서 보통 다음과 같은 폴더 이름을 분리한다.
    src - source 파일을 두는 폴더
    bin - binary 파일(컴파일로 생성된 바이트코드 파일)을 두는 폴더

    >javac -d 클래스파일을 둘 폴더 소스파일이 있는 폴더/파일명.java
    ex)
    >javac -encoding utf8 -d ./bin ./src/Exam05.java
 */