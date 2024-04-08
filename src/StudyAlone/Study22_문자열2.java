package StudyAlone;

import java.util.Arrays;

public class Study22_문자열2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // 소문자로 출력
        System.out.println(str1.toUpperCase()); // 대문자로 출력
        System.out.println();

        // replace()
        System.out.println(str1.replace("Study", "공부")); // "Study" 문자열을 "공부"로 변경
        System.out.println();

        // @substring()
        System.out.println(str1.substring(0, 4)); // 0 ≤ 인덱스 ＜ 5의 문자열
        System.out.println();

        // @split()
        // split 메소드의 리턴형은 String[] 문자열의 배열이다!
        String[] strArray = "abc/def-ghi jkl".split("/|-| "); // '/'또는 '-'또는 ' '(공백)으로 구분된 문자열 배열 반환
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        // @trim()
        // "앞뒤" 공백 지우기
        String _str1 = "   abc def   ";
        _str1 = _str1.trim();
        System.out.println(_str1);
        // 모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));
        System.out.println();

        // 특정 문자만 지우기
        // String _str2 = "Tom";
        // _str2 = "";

        // 문자열의 내용 비교
        String str2 = new String(("Java"));
        String str3 = new String(("Java"));
        String str4 = new String(("Java"));

        //@stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);
        System.out.println();

        //@equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println();
    }
}
