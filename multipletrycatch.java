public class multipletrycatch{
    public static void main(String[]args){
        try{
            int a=10,b=0;
            int result=a/b;
            System.out.println("Result = "+result);
        }

        catch(ArithmeticException e){
            System.out.println("Error: divisible by zero not allowed!");
        }

        System.out.println("-------");

        try{
            int[] arr=new int[5];
            arr[10]=50;
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of range!");
        }

        System.out.println("--------");

        try{
            String str=null;
            System.out.println(str.length());
        }

        catch(NullPointerException e){
            System.out.println("Error: Null value encountered!");
        }

        catch(Exception e){
            System.out.println("some other exception occured : "+e);
        }

        System.out.println("Program continues...");
    }
}