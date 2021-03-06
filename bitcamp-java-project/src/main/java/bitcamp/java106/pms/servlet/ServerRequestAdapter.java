package bitcamp.java106.pms.servlet;

import javax.servlet.http.HttpServletRequest;

import bitcamp.java106.pms.server.ServerRequest;

public class ServerRequestAdapter extends ServerRequest{
    HttpServletRequest request;
    
    public ServerRequestAdapter(HttpServletRequest request) {
        super("");
        this.request = request;
    }
       // 상속 받은 메서드를 현재 클래스 역할에 맞게 끔 재정의 하기 - 오버라이딩
        
        @Override
        public String getParameter(String name) {
            return request.getParameter(name);
       
    }
        
        @Override
        public String getServerPath() {
            return request.getPathInfo();
        }

}