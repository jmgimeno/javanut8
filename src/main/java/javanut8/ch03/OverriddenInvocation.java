package javanut8.ch03;

class A {
    int i = 1; // An instance field hidden by subclass B

    int f() {  // An instance method overridden by subclass B
        return i;
    }
}

class B extends A {
    int i;                    // This field hides i in A

    int f() {                 // This method overrides f() in A
        i = super.i + 1;      // It can retrieve A.i like this
        return super.f() + i; // It can invoke A.f() like this
    }
}

public class OverriddenInvocation {
}
