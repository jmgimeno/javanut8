package javanut8.ch03.overriden1;

class A {
    int i = 1;
    int f() { return i; }
    static char g() { return 'A'; }
}

class B extends A {
    int i = 2;  // Hides i in A
    int f() { return -i; } // Overrides f in A
    static char g() { return 'B'; } // Hides g in A
}

public class OverrideTest {
    public static void main(String[] args) {
        B b= new B();
        System.out.println(b.i);   // Refers to B.i; prints 2
        System.out.println(b.f()); // Refers to B.f(); prints -2
        System.out.println(b.g()); // Refers to B.g(); prints B
        System.out.println(B.g()); // A better way to invoke B.g()

        A a =(A) b;                // Casts b to a reference of class A
        System.out.println(a.i);   // Now refers to A.i; prints 1
        System.out.println(a.f()); // Still refers to B.f(); prints -2
        System.out.println(a.g()); // Refers to A.g(); prints A
        System.out.println(A.g()); // A better way to invoke A.g()
    }
}
