import java.util.Scanner;
public class grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject:");
        int a = sc.nextInt();
        System.out.println("Enter the marks of 2nd subject:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of 3rd subject:");
        int c = sc.nextInt();

        int total = a+b+c;
        double percentage = total * 3 / 100.0;
        System.out.println("Total percentage: " + percentage + "%");

        if (percentage >=75)
        {
            System.out.println("Distinction");
        }

        else if(percentage >=60)
        {
            System.out.println("B");
        }

        else if(percentage >=50)
        {
            System.out.println("C");
        }

        else if(percentage >=40)
        {
            System.out.println("D");
        }

        else
        {
            System.out.println("Fail");
        }

    }
}

