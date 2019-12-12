package vip.liandao.javabasis.controller;

public class UseFinal {
    private final String a = "cc";
    public final int E;

    public UseFinal(int x) {
        E = x;
    }

    public static void main(String[] args) {
        UseFinal c = new UseFinal(1);
        System.out.println(c.E);

        UseFinal1 u = new UseFinal1(2);
        u.ia("1");
        u.ia(1);
        u.ia();
        ff(3);


        // Non-static field 'a' cannot be referenced from a static context
        // a = "567";
        // final a = "777";
    }

    public static final void ia() {
        System.out.println("iaia");
    }

    // final 方法可以被重写
    public static void ia(String a) {
        System.out.println("string");
    }

    public static void ff(final int i) {
        System.out.println(i);
        // i= 2;
        // Cannot assign a value to final variable 'i'
    }
}

final class info {

}

//class info2 extends info {
//// Cannot inherit from final 'vip.liandao.javabasis.controller.info'
//}

class UseFinal1 extends UseFinal{
//    public static final void ia() {
//        // 'ia()' cannot override 'ia()' in 'vip.liandao.javabasis.controller.UseFinal'; overridden method is final
//    }
    public UseFinal1(int x) {
        super(x);
    }

    public static void ia(int a) {
        System.out.println("int");
    }
}