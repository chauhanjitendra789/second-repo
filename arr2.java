import java.util.Scanner;
public class arr2{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size=sc.nextInt();
    int[] a=new int[size];
    System.out.println("Enter the "+size+" Elements : ");
    int i;
    for(i=0;i<size;i++){
        a[i]=sc.nextInt();
    }
    int sum=0;
    for(i=0;i<size;i++){
        sum=sum+a[i];
    }
    System.out.println("Sum of array is " +sum);

}
}