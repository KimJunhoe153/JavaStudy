class MyGeneric <T> {
    T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class A {
    @Override
    public String toString() {
        return "클래스 A 객체";
    }
}
class B {
    @Override
    public String toString() {
        return "클래스 B 객체";
    }
}

public class Exam_617p {
    public static void main(String[] args) {

        A a_in = new A();
        B b_in = new B();


        mg1.set(b_in);
        A a_out = mg1.get();
        System.out.println(a_out); // 클래스 A 객체


    }
}
