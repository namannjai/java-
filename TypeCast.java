 class A{
    public void show1(){
System.out.println(" In  A Show ");
    }
}
class B extends A{
    public void show2(){
        System.out.println("IN B show");
    }
}


public class TypeCast{
    public static void main(String[] args) {
        
    
     A obj =  new B();
   obj.show1(); 

   B obj1 = (B) obj;
   obj1.show2();
    }
}