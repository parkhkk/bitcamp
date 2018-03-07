// 배열 - 초기화

package step02;

public class Exam09_4 {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[] {100, 200, 300};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        // 새 배열의 주소가 저장되면 이전 배열의 주소는 잃어버린다.

        arr1 = new int[] {10, 20, 30, 40, 50};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

    }
}