// Static vars have same value everywhere
// if value is changed anywhere in the cpde the value for all objects change
// if value is assigned to one object, all object have same values
// Static vars should not be called by object, but by class name itself
class Student
{
    int rollno;
    static String class1;
}

public class StaticVar {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.rollno = 10;
        s2.rollno = 20; 

        Student.class1 = "TYCM";
        System.out.println(Student.class1);
        Student.class1 = "FYCM";
        System.out.println(Student.class1);
    }
    
}
