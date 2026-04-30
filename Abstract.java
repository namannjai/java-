abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("punjabi aa gaye oye");
    }

}
 class GWagon extends Car{
    public void drive(){
        System.out.println("broom broom ...");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Car obj = new GWagon();
        obj.playMusic();
        obj.drive();
    }
}