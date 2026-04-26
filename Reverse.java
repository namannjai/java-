
import java.util.*;

public class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
    long reversed = 0;

while(num != 0) {
    long digit = num % 10;
    reversed = reversed * 10 + digit;
    num /= 10;
}
System.out.println(reversed); // Output: 54321

    }
}