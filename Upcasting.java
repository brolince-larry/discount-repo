class A {
    void show(){
        System.out.println("class A");
    }
    
}
class B extends A{
    void show(){
        System.out.println("class B");
    }
}
public class Upcasting{
    public static void main(String[] args) {
        A obj= new B();
        obj.show();
    }
}
