public class scs2{
    public static void main(String []args){
        double a=1;
        double b=4;
        double c=6;
       double discriminant=((b*b) - (4*a*c)) ;
        
        double root1 =(-b + discriminant)/(2*a) ;
        double root2 =(-b - discriminant)/(2*a) ;
        if(discriminant==0){
            System.out.println(root1);
        }else if(discriminant>=0){
            System.out.println("root1 = "+ root1);
            System.out.println("root2 = "+ root2);
        }else if(discriminant<0){
            System.out.println("the equation has no real roots");
        }
    }
}