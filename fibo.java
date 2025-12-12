import java.util.Scanner;
public class fibo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        int i;
        for(i=1;i<=num;i++){
            next=first+second;
            first=second;
            second=next;
            System.out.println(next);
        }
    }
}