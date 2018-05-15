package bitcamp.java106.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;
import bitcamp.java106.pms.controller.Controller;

@WebServlet("/*") // 클라이언트의 모든 요청ㅇ르 이 서블릿이 처리하겠다는 선언이다.
public class DispatcherServlet implements Servlet {

    ApplicationContext iocContainer;
    ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // 최초의 요청이 들어오면 딱 한번 실행 한다.
        // 그래서 서블릿이 실행하는데 필요한 자원을 준비하는 코드를 여기에 두면 된다.
        this.config = config;
        
        iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        
    }

    @Override
    public ServletConfig getServletConfig() {
        
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      HttpServletRequest request = (HttpServletRequest)req;
      HttpServletResponse response = (HttpServletResponse) res;
      
      response.setHeader("Content-Type","text/plain;charset=UTF-8" );
      PrintWriter out = response.getWriter();
      
      String path = request.getPathInfo();
      Controller controller = (Controller) iocContainer.getBean(path);
      
      if (controller != null) {
          controller.service(
                  new ServerRequestAdapter(request),
                  new ServerResponseAdapter(response));
      } else {
          out.println("해당 명령을 처리할 수 없습니다.");
      }
      
      // 클라이언트가 요청한 자원의 이름을 알아낸다.
      
    }

    @Override
    public String getServletInfo() {
        
        return "요청 처리를 중계하는 서블릿";
    }

    @Override
    public void destroy() {
        
        
    }

}

// 톰켓서버에 프로그램 배치하기
// 1) 프로그램 폴더를 만든다.
//   => $톰켓홈/webaoos/pms 폴더생성
// 2) 자바 클래스파일을 둘 폴더를 만든다.
//   => $톰켓홈/webaoos/pms/WEB-INF/classes
// 3) 컴파일된 클래스 파일 및 패키지를 배치한다.
//   => 프로젝트/bin/main/* --> WEB-INFO/classes/* 복사
// 4) 외부 라이브러리를 배치한다.
//   => *.jar ---> WEB0INF/lib/*.jar 복사한다.
// 5) *.jar 파일을 복사하는 방법
//   => gradle을 이용하여 이클립스에서 설정파일을 만든경우 
//      이클립스에서 컴파일하거나 실행할 떄 사용하는 외부 라이브러리는
//      gradle이 관리하는 라이브러리이다.
//   => 이 라이브러러리를 배포하려면 gradle을 통해 라이브러리를 복사해야한다.
//      >gradle build 실행!
//      