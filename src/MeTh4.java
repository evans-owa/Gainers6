public class MeTh4 {
    public static void main(String[] args) {
            //increment
        int i = 3;
        int j = ++i;
        System.out.println("value of i is " + i + ", j value is " + j);

        int r = 7;
        int s = r++;
        System.out.println("value of r is " + r + ", s value is " + s);

        int q = 9;
        int p = q++ + 7;
        System.out.println("value of q is " + q + ", p value is " + p);

        int z = 5;
        int y = ++z + 5; // 11

        System.out.println("value of z is " + z + ", y value is " + y ); //z is 6  y is 11
    }
}
