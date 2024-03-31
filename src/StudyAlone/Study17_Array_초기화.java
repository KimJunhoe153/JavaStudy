package StudyAlone;

import java.util.Arrays;

public class Study17_Array_초기화 {
    public static void main(String[] args) {
        // 배열의 초기화
        // 배열을 선언, 생성하고 입력값을 넣지 않은 경우, 자동으로 초기가 값이 입력됨.
        int[] intList = new int[3];
        float[] floatList = new float[3];
        boolean[] booleanList = new boolean[3];
        char[] charList = new char[3];
        String[] strList = new String[3];

        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(booleanList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));
    }
}
