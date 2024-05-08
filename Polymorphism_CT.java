class A{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a){
        System.out.println(a+2);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

public class Polymorphism_CT {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(5);
        obj.add(5,2);
        obj.add(5,6,8);
    }
}
