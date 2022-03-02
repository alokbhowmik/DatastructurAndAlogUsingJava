package com.company;


class A{
    void show(){
        System.out.println("Show method of A");
    }
}

class B extends A{
    @Override
    void show() {
        System.out.println("Show method of class B");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}
