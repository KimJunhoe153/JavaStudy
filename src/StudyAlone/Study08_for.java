package StudyAlone;

public class Study08_for {
    public static void main(String[] args) {
        // for문 변경하기
        int i = 0;
        for (; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            } else {
                break;
            }
        }
        System.out.println();
        // 멀티 조건식
        for (int a = 0, b = 0; a < 5 || b < 5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
    }
}
