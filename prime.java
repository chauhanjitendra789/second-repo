import java.util.Scanner;

public class prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of prime numbers :");
        int n=sc.nextInt();
        int count=0;
        int num=2;

        while(count<n){
            boolean isPrime=true;

            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}