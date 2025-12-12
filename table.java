import java.util.Scanner;
public class table{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print table");
        int a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+"*"+i+"="+(a*i));
            i++;
        }
    }
}