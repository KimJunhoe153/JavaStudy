package StudyAlone;

public class Study14_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) { // 홀수의 경우 아래로 출력문을 실행하지 않음
                continue;
            }
            System.out.println();
        }
//        이중 for문에서의 continue
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue; // "3" 만 출력을 안함
                }
            }
        }
    }
}
