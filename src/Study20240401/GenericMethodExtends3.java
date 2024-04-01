package Study20240401;

class Test {
    void method1(Goods2<E> g) {} // T를 사용할 수 없음. 구체적인 클래스 명시.

    void method2(Goods2<?> g) {} // 어떤 클래스던 가능

    void method3(Goods2<? extends F> g) {} // F와 F의 자식클래스 가능

    void method4(Goods2<? super F> g) {} // F와 F의 부모클래스 가능
}

public class GenericMethodExtends3 {
    public static void main(String[] args) {
        Test test = new Test();
        // case1
        test.method1(new Goods2<E>()); // E만 가능
//        test.method1(new Goods2<F>()); // 불가능

        // case2 : Goods2<?>
        test.method2(new Goods2<E>());
        test.method2(new Goods2<F>());
        test.method2(new Goods2<G>());
        test.method2(new Goods2<H>());

        // case3 : Goods2<? extends F>
//        test.method3(new Goods2<E>()); // F와 F의 자식클래스만 가능
        test.method3(new Goods2<F>());
        test.method3(new Goods2<G>());
        test.method3(new Goods2<H>());

        // case4 : Goods2<? super F>
        test.method4(new Goods2<E>());
        test.method4(new Goods2<F>());
//        test.method4(new Goods2<G>()); // F와 F의 부모클래스만 가능
//        test.method4(new Goods2<H>());
    }
}
