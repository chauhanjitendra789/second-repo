import java.util.Scanner;
public class max{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        System.out.println("Enter the third number :");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is bigger");
        }
        else if(b>c && b>a){
            System.out.println("B is bigger");
        }
        else{
            System.out.println("C is bigger");
        }
    }
}