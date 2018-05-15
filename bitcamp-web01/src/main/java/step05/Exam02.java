// 파일 업로드 - 멀티파트 파라미터 값 추출하기
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step05/exam02")
public class Exam02 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 테스트 방법:
        // http://localhost:8888/java106-web01/step05/exam02_test.html
        
        // 멀티파트로 전송된 POST 요청 데이터를 추출하려면 일반적인 방법으로는 안된다.
        // apache.org 사이트의 라이브러리를 사용하여 처리해 보자!
        // 1) 의존 라이브러리 정보 알아내기
        //    mvnrepository.com 에서 "apache fileupload" 검색 
        // 2) build.gradle 에 의존 라이브러리 정보 추가
        // 3) "gradle eclipse" 실행하여 이클립스 설정 파일 갱신
        // 4) 이클립스 IDE에서 프로젝트 갱신
        
        // apache-fileupload 라이브러리를 사용하여 클라이언트가 보낸 멀티파트 데이터를 추출해보자! 
        // 1) 클라이언트가 보낸 데이터가 멀티파트 형ㅅ깅니지 검사한다.
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if(!isMultipart) {
            out.println("멀티 파트 형식이 아닙니다!");
            return;
        }
        
        // 2) 멀티 파트 데이터를 추출하여 HDD에 저장할 공장 준비
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 3) 멀티파트 데이터 분석기에 공장 객첼르 장착한다.
        //  => 멀티 파트 데이터 분석기가 멀티파트 데이터를 추출하면 공장객체가 파일로 만들어 HDD에 저장한다.
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 4) 멀티파트로 전송된 요청 데이터 분석하기
        Map<String,String> paramMap = new HashMap<>();
        try {
            List<FileItem> items = upload.parseRequest(request);
            
            for(FileItem item : items) {
                if(item.isFormField()) { //일반적인 텍스트 항목
                    // 파라미터의 한글이 깨질 경우,
                    // 
                    out.printf("%s=%s\n", item.getFieldName(), item.getString("UTF-8"));
                }else {
                    out.printf("%s=%s\n",
                            item.getFieldName(),
                            item.getName());
                    // 클라이언트가 보낸 파일을 저장하자!
                    // - 임의의 폴더에 저장하면 웹 브라우저에서 업로드한 파일을 다시 다운로드를 받기 어렵다.
                    //   임의의 폴더? 웹브라우저에서 접근할 수 없는 폴더를 말한다.
                    // - 임의의 폴더에 저장할 경우, 다운로드를 처리해주는 서블릿을 별도로 만들어야 한다.
                    // 좀더 쉬운 방법은?
                    // - 웹브라우저가 접근할 수 있는 폴더에 저장하자!
                    // - 단 이 방법은 웹브라우저에서 너무 쉽게 특정 파일을 접근할 수 있기 때문에
                    //   보안에 취약하다.
                    // 실무는 어떤 방식을 취하나?
                    // - 웹브라우저가 접근할 수 없는 곳에 저장한다.
                    // - 오직 다운로드 서블릿을 통해서만 허가된 사용자가 다운로드 받을 수 있도록 한다.
                    //
                    ServletContext appEnvInfo = request.getServletContext();
                    String savedPath = appEnvInfo.getRealPath("/");
                    out.println(savedPath);
                    item.write(new File(savedPath + "/" + item.getName()));
                }
            }
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석 중 오류 발생.");
        }

        
        //out.printf("이름=%s\n", name);
        //out.printf("나이=%s\n", age);
        //out.printf("사진=%s\n", photo);
        
        
    }
}







