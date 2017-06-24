package bootApp.inheritance;

public class Initialization {


    int i = 1;
    static int staticA = 3;

    {
        int i2 = 1;
        System.out.println("i2 = " + i2);
    }

    static {
        int staticIntInBlock = 1;
        System.out.println("staticIntInBlock = " + staticIntInBlock);

    }


    static class A {
        A() {
            System.out.println("1");
        }

        public A(String str) {
            System.out.println("2" + str);
        }

    }

    static class B extends A {
        B() {
            System.out.println("3");
        }

        B(String str) {
            super(str);
            System.out.println("4" + str);
        }
    }

    static class C extends B {
        C() {
            System.out.println("5");
        }

        C(String str) {
            super(str);
            System.out.println("6" + str);
        }
    }

    static class D extends C {

        static {
            System.out.println("static juju");
        }

        {
            System.out.println("juju");
        }

        D() {
            System.out.println("7");
        }

        D(String str) {
            super(str);
            System.out.println("8" + str);
        }
    }


    public static void main(String args[]) {
        C instance = new D("hello");
    }

    static {
        System.out.println("before main");
    }

}
