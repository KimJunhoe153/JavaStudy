package StudyAlone;

public class Study13_break {
    public static void main(String[] args) {
//         break = 제어문의 중괄호{}를 탈출시키는 키워드
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i > 5) {
                break;
            }
//            이중 for문에서의 break 사용법
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 99999; // 매우 큰 수를 세팅해서 밖 for문 탈출
                }
                System.out.println(i + ", " + j);
            }
            System.out.println();
        }
//        밖 for문까지 탈출하는 다른 방법
        out:
//        out이라는 단어 자체는 의미 없음. 그저 표시일 뿐.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
