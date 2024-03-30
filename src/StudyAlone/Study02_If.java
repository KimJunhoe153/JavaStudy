package StudyAlone;

import java.util.Scanner;

public class Study02_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요. : ");
        int score = scanner.nextInt();

        if (score >= 91) {
            System.out.println("A학점 입니다.");
        } else if (score <= 90 && score > 81) {
            System.out.println("B학점 입니다.");
        } else if (score <= 80 && score > 71) {
            System.out.println("C학점 입니다.");
        } else if (score <= 70 && score > 61) {
            System.out.println("D학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }
        System.out.println("축하합니다.");
    }
}