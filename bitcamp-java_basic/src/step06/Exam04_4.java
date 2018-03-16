package step06;

import java.util.Scanner;

class MyObject {
    int a;
    int b;
}

public class Exam04_4 {
    static void m1(int value) {
        int r1 = m2(value);
        int r2 = m3(value);
        return r1 + r2;
    }
    static int m2(int value) {
        return value + 100;
    }
    static int m3(int value) {
        return value + 200;
    }
    static MyObject getMyObject() {
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        return ref;
    }

    public static void main(String[] args) {
        int r = m1(5);
        System.out.println(r);
    }
}