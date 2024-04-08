package HomeWork.HW20240403;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {

        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 5개를 입력하세요 : ");

        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.next();
            stringSet.add(str);
        }

        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}