package StudyAlone;

import java.util.Scanner;

public class Study04_switch {
        public static void main(String[] args) {
            System.out.println("You say 아이우에오?");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();

            switch (a) {
                case "아":
                    System.out.println("아 is あ");
                    break; // 항상 break 키워드와 함께 쓰자
                case "이":
                    System.out.println("이 is い");
                    break;
                case "우":
                    System.out.println("우 is う");
                    break;
                case "에":
                    System.out.println("에 is え");
                    break;
                case "오":
                    System.out.println("오 is お");
                    break;
                default:
                    System.out.println("뭐여");
                    break;
            }
        }
    }
