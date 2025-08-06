import java.util.Scanner;
public class User3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String a = sc.nextLine();
        System.out.println("Enter the address:");
        String b = sc.nextLine();
        System.out.println("Enter the phone number:");
        String c = sc.nextLine();
        System.out.println("Enter the percentage:");
        double d = sc.nextDouble();

        System.out.println("User Details:");
        System.out.println("Name: " + a);
        System.out.println("Address: " + b);
        System.out.println("Phone Number: " + c);
        System.out.println("Percentage: " + d);
    }
}
