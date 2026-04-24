class Human{
    private int age;
    private String name;
    public Human(){
        System.out.println("constructor is called default values assigned");
        age =22;
        name = "naman";
    }
    public Human(int a , String name){
        age =a;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age ){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Constructo{
    public static void main(String[] args) {
        Human obj = new Human(23,"namen");
        // obj.setAge(69);
        // obj.setName( "jaiswal ji");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}