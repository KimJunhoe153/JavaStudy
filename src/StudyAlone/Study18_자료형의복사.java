package StudyAlone;

import java.util.Arrays;

public class Study18_자료형의복사 {
    public static void main(String[] args) {
        // 기본 자료형의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b);
        b = 5;
        System.out.println(a + " " + b);
        System.out.println();

        // 참조 자료형의 복사, 참조 복사 또는 주소 복사
        int[] intList1 = {3, 4, 5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));
        System.out.println();

        intList2[0] = 10;
        System.out.println(Arrays.toString((intList2)));
        System.out.println(Arrays.toString((intList1)));
        System.out.println();

        // 배열과 for문의 사용
        // 조건식에 배열의 갯수(length)를 사용함
        for (int i = 0; i < intList2.length; i++) {
            System.out.println(intList2[i]);
            System.out.println();
        }
    }
}
