package StudyAlone;

import java.util.Scanner;

public class Study05_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // switch 문
        System.out.println("숫자를 입력하세요");
        int a = scanner.nextInt();
        switch (a) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");

                // if문
                System.out.println("한 번 더 입력하세요");
                int b = scanner.nextInt();
                if (b >= 9) {
                    System.out.println("A");
                } else if (b == 8) {
                    System.out.println("B");
                } else if (b == 7) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
        }
    }
}