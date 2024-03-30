package StudyAlone;

import java.util.Scanner;

public class Study03_if_else {
    public static void main(String[] args) {

        // if 단독사용
        boolean x = true;
        if (x) {
            System.out.println("Testing!");
        }
        if (!x) {
            System.out.println("?");
        }

        // if ~ else
        if (x) {
            System.out.println("x는 true");
        } else {
            System.out.println("x는 false");
        }
        System.out.println();

        // if ~ else의 중복 사용
        boolean a = false;
        boolean b = true;
        boolean c = true;

        if (a) {
            System.out.println("a가 ture");
        } else if (b) {
            System.out.println("a는 false, b가 ture");
        } else if (c) {
            System.out.println("a, b는 false, c가 ture");
        } else {
            System.out.println("a, b, c는 false");
        }
        System.out.println();

        // 학점 코드 (범위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100%를 커버해야 한다
        // 중복 해당되도록 조건을 만들면 안된다
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A학점");
            System.out.println();
        } else if (score >= 80 && score < 89) {
            System.out.println("B학점");
            System.out.println();
        } else if (score >= 70 && score < 79) {
            System.out.println("C학점");
            System.out.println();
        } else if (score >= 60 && score < 69) {
            System.out.println("D학점");
            System.out.println();
        } else {
            System.out.println("F학점");
            System.out.println();
        }

        // 관계가 없는 코드 if else로 설정하면 안된다
        int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        } else if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        System.out.println();

        // 독립적인 if문으로 만드는 것이 좋다
        if (num > 0) {
            System.out.println("num은 양수");
        }
        if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }

        // if문 속에 if문
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("if문 속에 if문");
                }
            }
        }
    }
}
