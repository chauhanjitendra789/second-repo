import java.util.Scanner;

public class secondmax{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want for input: ");
        int n=sc.nextInt();

        if(n<2){
            System.out.println("you need to enter atleast two numbers");
            return;
        }

        System.out.println("Enter number 1: ");
        int num=sc.nextInt();
        int max=num;
        int secondmaxx=Integer.MIN_VALUE;

        for(int i=2;i<=n;i++){
            System.out.println("Enter number"+i+" : ");
            num=sc.nextInt();

            if(num>max){
                secondmaxx=max;
                max=num;
            }
            else if(num>secondmaxx && num!=max){
                secondmaxx=num;
            }
        }
        if(secondmaxx==Integer.MIN_VALUE){
            System.out.println("There is no distinct second maximum(all numbers may be equal)");
        }
        else{
            System.out.println("The second maximum number is :"+secondmaxx);
        }
    }
}