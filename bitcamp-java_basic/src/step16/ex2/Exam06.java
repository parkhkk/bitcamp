package step16.ex2;

import java.net.URL;

public class Exam06 {
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("file://home/user/test.txt");

        System.out.printf("프로토콜: %s\n", url.getProtocol());
        System.out.printf("서버주소: %s\n", url.getHost());
        System.out.printf("포트번호: %s\n", url.getPort());
        System.out.printf("자원경로: %s\n", url.getPath());
        System.out.printf("쿼리스트링: %s\n", url.getQuery());
    }

}
