import java.util.Scanner;
// example two for input scanner
public class MeTh1 {
    public static void main(String[] args) {
        System.out.print("Enter your name and age");

        Scanner details = new Scanner(System.in);
        System.out.println(details.nextLine()+ " your are "+ details.nextDouble() + " old");
    }
}
