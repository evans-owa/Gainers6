import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name and age "); //message
        String name = input.nextLine(); // reading users method using nextLine() method
        double age = input.nextDouble(); //
        System.out.println(name + " " + "Your are" + " " + age +" "+ "old");
    }
}