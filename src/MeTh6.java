public class MeTh6 {
    public static void main(String[] args) {

        //dividing operation by casting both explicit and implicit
        int i1 =3;
        int i2 =2;
        double d1 = 4;

        System.out.println(i1/i2);
        System.out.println((double) i1/i2); //1
        System.out.println(i1/(double)i2); //1.5 explicit casting to double
        System.out.println(i1/d1); // 1.5 implicit casting to double cause of the d1

        System.out.println((double) (i1/i2)); // 1.0
    }
}
