// 패키지

// 소스 파일이 놓기는 루트 폴더의 하위 폴더명을 적어야 한다.
// 즉 src 폴더는 소스 파일을 두는 루트 폴더이기 때문에 
// 패키지명에 포함해서는 안된다.

package step01;

public class Exam01 {
    public static void main(String[] args) {
        System.out.println("src/step01/Exam01");
    }
}

/**
    클래스를 분류하기 위한 문법이 "패키지"이다.
    => 소스 파일에 첫 명령어로 package를 선언한다.
    
        package 폴더명.폴더명.폴더명;
        ex) package step01.ex.test;
    
    => 패키지명은 보통 소스 파일이 있는 경로와 같게한다.
       달라도 되지만, 패키지명과 소스 파일의 경로가 다르면
       소스 파일을 관리하기 힘들 것이다.
    
    => -d 옵션을 사용하여 컴파일하면 패키지명에 해당하는 
       폴더가 자동으로 생성되고 그 폴더에 .class 파일이 놓인다.

    패키지에 소속된 클래스 실행하기
    > javac -classpath 패키지의 위치 패키지명.클래스명
    > javac -classpath bin step01.Exam01
    => 클래스가 있는 위치를 지정해서는 안된다.
    => -classpath에는 반드시 패키지가 있는 위치를 지정해야 한다.
        -클래스가 있는 위치가 아니라 
        패키지가 있는 위치를 지정해야 한다.

    -패키지 이름을 짓는 규칙
    => 패키지명도 다른 개발자가 만든 이름과 같을 수 있다.
    => 그래서 보통 출동이 일어나지 않도록 인터넷 도메인 이름을 사용한다.
    => 폴더를 계층 구조로 사용하기 쉽도록 
       도메인 명을 꺼꾸로 사용한다.
       ex) 
       도메인명 : bitcamp.co.kr
       애플리케이션명 : hrd(인사관리시스템)
       패키지명 : kr.co.bitcamp.hrd
       패키지명 : kr.co.bitcamp.scm
    => src
        /kr
          /co
            /bitcamp
              /hrd
              /scm
     */