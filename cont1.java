public class br{
    public static void main(String[]args){
        int i=1;
        while(i<=10){
            if(i==6){
                System.out.println("my name is white-black");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}