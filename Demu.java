public class Demu{
    public static void main(String args[]){
        VeryAdvanceCalc c1 = new VeryAdvanceCalc();
        int r1 = c1.add(5,9);
        int r2 = c1.sub(7,4);
        int r3 = c1.multi(3, 9);
        int r4 = c1.div(6,3);
        double r5 = c1.power(5,3);
        System.out.println(r1 + " "+r2 + " " +r3 +" " +r4 + " "+ r5);
    }
}
