import java.util.Scanner;
public class arr3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element number : ");
        int a=sc.nextInt();
        System.out.println("Enter the "+a+" String : ");
        String[] arr=new String[a];
        int i;
        for(i=0;i<=a;i++){
            arr[i]=sc.nextLine();
        }
            System.out.print("your string is : ");
        for(i=0;i<a;i++){
            System.out.println(arr[i]);
        }
    }
}