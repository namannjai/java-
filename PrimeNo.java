public class PrimeNo{
    public static void main(String[] args) {
        int n=1;
        String prime="is a prime number";
        if( n<=1){
            System.out.println("is not a prime number");
            return;
        }
        for (int i =2;i<n;i++){
            
            if(n%i==0){
                System.out.println("divisible by :"+i);
                prime=" is not a prime number";
                break;
            }

            
        }
        System.out.println(prime);
    }
}