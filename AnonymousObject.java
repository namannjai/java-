class A{
    public A(){
        System.out.println("Constructor is called");
    }
    public void show(){
System.out.println("inside show method");
    }
}
public class AnonymousObject{
    public static void main(String[] args) {
        A a1;
        a1 =new A();

        a1.show();
    }
}