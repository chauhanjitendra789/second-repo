import java.util.Scanner;
public class arr1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 elements :");
        int[] b=new int[5];
        int i;
        for(i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("your arrays is :");
        for(i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}