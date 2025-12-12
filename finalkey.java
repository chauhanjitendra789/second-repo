class Student{
    final String collegename="ABC Institute";
    int rollno;
    String name;

    Student(int r,String n){
        rollno=r;
        name=n;
    }

    void showDetails(){
        System.out.println("ROll No is : "+ rollno);
        System.out.println("Name  is : "+ name);
        System.out.println("college is : "+ collegename);

    }
}

public class finalkey{
    public static void main(String[] args){
        Student s1=new Student(1,"Rahul");
        Student s2=new Student(2,"priya");

        s1.showDetails();
        System.out.println("------------");
        s2.showDetails();
    }
}

