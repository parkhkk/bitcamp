// 파일 업로드 - 멀티파트 파라미터 값 추출하기
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/step05/exam03")
public class Exam03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        // 테스트 방법:
        // http://localhost:8888/java106-web01/step05/exam02_test.html

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 멀티파트로 전송된 POST 요청 데이터를 추출하려면 일반적인 방법으로는 안된다.
        // apache.org 사이트의 라이브러리를 사용하여 처리해 보자!
        // 1) 의존 라이브러리 정보 알아내기
        //    mvnrepository.com 에서 "apache fileupload" 검색 
        // 2) build.gradle 에 의존 라이브러리 정보 추가
        // 3) "gradle eclipse" 실행하여 이클립스 설정 파일 갱신
        // 4) 이클립스 IDE에서 프로젝트 갱신

        // apache-fileupload 라이브러리를 사용하여 클라이언트가 보낸 멀티파트 데이터를 추출해보자! 
        // 1) 클라이언트가 보낸 데이터가 멀티파트 형식인지 검사한다.
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            out.println("멀티파트 형식이 아닙니다!");
            return;
        }

        // 2) 멀티파트 데이터를 HDD에 저장할 공장 준비  
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 3) 멀티파트 데이터 분석기에 공장 객체를 장착한다.
        // => 멀티파트 데이터 분석기가 멀티파트 데이터를 추출하면 
        //    공장객체가 파일로 만들어 HDD에 저장한다.
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 4) 멀티파트로 전송된 요청 데이터 분석하기
        try {
            Map<String,List<FileItem>> paramMap = upload.parseParameterMap(request);
            out.printf("name=%s\n",paramMap.get("name").get(0).getString("UTF-8"));    
            out.printf("age=%s\n",paramMap.get("age").get(0));
            FileItem photo = paramMap.get("photo").get(0);
            out.printf("photo=%s\n", photo.getName());

            ServletContext appEnvInfo = request.getServletContext();
            String savedPath = appEnvInfo.getRealPath("/");
            out.println(savedPath);
            photo.write(new File(savedPath + "/" + photo.getName()));
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석 중 오류 발생!");
        }
    }
}






