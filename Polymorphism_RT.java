class A{
    public void print(){
        System.out.println("I claa A");
    }
}

public class Polymorphism_RT {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
    }
}


class B extends A{
    public void print(){
        System.out.println("in class B");
    }
}

class C extends B{
    public void print(){
        System.out.println("in class C");
    }
}