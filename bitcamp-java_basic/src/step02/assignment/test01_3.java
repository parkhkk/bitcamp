package step02.assignment;

public class test01_3 {
    public static void main(String[] args) {
        
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] math = new int[5];
        int[] eng = new int[5];
        int[] sum = new int[5];
        float[] ave = new float[5];
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner sc = new java.util.Scanner(keyboard);

             

        for (int i = 0; i < 5; i++) {
            System.out.print("입력? ");
            name[i] = sc.next();
            kor[i] = sc.nextInt();
            math[i] = sc.nextInt();
            eng[i] = sc.nextInt();
            sum[i] = kor[i] + math[i] + eng[i];
            ave[i] = sum[i]/3; 
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %d %d %d %f\n", name[i], kor[i], math[i], eng[i], sum[i], ave[i]);   
        }
                
        
    }
}