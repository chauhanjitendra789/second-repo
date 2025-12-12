public class patt{
    public static void main(String[]args)
    {
      int i;
      int j;
      for(i=1;i<=4;i++){
        for(j=0;j<i;j++){
            System.out.print((char)('A'+j));
        }
            System.out.println();
      }
    }
}