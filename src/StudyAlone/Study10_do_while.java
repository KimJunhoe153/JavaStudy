package StudyAlone;

public class Study10_do_while {
    public static void main(String[] args) {
        int cnt1 = 0; // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++; // 증감식
        } while (cnt1 < 5); // 조건식

//         아래 while문과 비교했을 때
//         반복문의 조건이 처음부터 false인 경우
//         do-while문은 실행코드가 1회 실행되는 반면,
//         while문은 실행되지 않음

        int cnt2 = 5;
        while (cnt2 < 5) ;
        System.out.println(cnt2 + " ");
        cnt2++;
    }
}
