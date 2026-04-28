
import java.util.Objects;

class Laptop{
    String model;
    int price;

    // public String toString(){
    // return model + ":"+price;
    // }
    // public boolean equals(Laptop that){
    //     if (this.model.equals(that.model) && this.price == that.price)
    //         return true;
    //     else 
    //     return false;
    // }

    
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.model);
        hash = 71 * hash + this.price;
        return hash;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop{");
        sb.append("model=").append(model);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    
}
public class HashCode{
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;
         
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}