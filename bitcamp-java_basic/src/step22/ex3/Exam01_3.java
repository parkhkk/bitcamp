// Byte Stream
package step22.ex3;

import java.io.FileOutputStream;

public class Exam01_3 {

    public static void main(String[] args) throws Exception {
        FileOutputStream out  = new FileOutputStream("temp/test3.data");
        
        long money = 400_0000_0000_0000L;
        
        out.write((int)(money >> 52));
        out.write((int)(money >> 48));
        out.write((int)(money >> 40));
        out.write((int)(money >> 32));
        out.write((int)(money >> 24)); 
        out.write((int)(money >> 24));
        out.write((int)(money >> 24));
        out.write((int)(money >> 24));
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
    }

}
