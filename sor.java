import java.util.Arrays;
import java.util.Scanner;
public class sor{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements :");
        int[] a=new int[5];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }  

        Arrays.sort(a);
        System.out.println("you have enter :");

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}