import java.util.scanner;
public class user{
    publi static void main(string[args]){
        scanner sc = new scanner(system.in)
        system.out.println("enter the number");
        string a = sc.nextLine();
        if(a>0){
            system.out.println("positive number");
        } else if(a<0){
            system.out.println("negative number");
        } else {
            system.out.println("zero");
        }
    }
}