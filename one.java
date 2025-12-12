import java.util.Scanner;
public class one{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[] a=new String[5];
        System.out.println("Enter the first array value: ");
        int i;
        for(i=1;i=5;i++){
             a[i]=sc.nextLine();
        }

        System.out.println("Enter the second array value: ");

        for(i=1;i<=5;i++){
            b[i]=sc.nextLine();
        }

        System.out.println(a);
    }
}