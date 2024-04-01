package Study20240401;

class GenericMethods { // 일반클래스 안에 정의한 Generic Method 예제
    public int method0(int a) {
        // 일반 Method
        return a;
    }

    public <T> T method1(T t) { // Generic Method}
        return t;
    }

    public <T> boolean method2(T t1, T t2) { // 한개의 Generic타입을 사용
        return t1.equals(t2);
    }

    public <K, V> void method3(K k, V v) { // 두개의 Generic타입을 사용
        System.out.println(k + " : " + v);
    }

    public <A, B, C> void method4(A a, B b, C c) { // 세개의 Generic타입을 사용
        System.out.println(a + " : " + b + " : " + c);

        // Generic에서도 내부에서 사용할 수 있는 메서드
//        public <T> void method5(T t) {
//            System.out.println(toString().length());
//        }
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method1("Hello");
        String str2 = gm.method1("Hello"); // <String> 생략 (앞뒤 정보로 유추 가능하기 때문)
        System.out.println(str1);
        System.out.println(str2);

        boolean bool1 = gm.<Double>method2(2.5, 2.5);
        boolean bool2 = gm.method2(2.5, 2.5); // <Double> 생략
        System.out.println(bool1);
        System.out.println(bool2);

        gm.<String, Integer>method3("국어", 80);
        gm.method3("국어", 80); // <String>, <Integer> 생략

        gm.method4("평균", 85.5, 10);
        gm.<String, Double, Integer>method4("평균", 85.5, 10); // <String>, <Double>, <Integer> 생략

    }
}
