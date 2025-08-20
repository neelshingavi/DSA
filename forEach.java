// foreach loop explaination
// array of objects

class Student
{
    int rollno;
    String name;
}
public class forEach {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Neel";
        s1.rollno = 1;
        s2.name = "Yash";
        s2.rollno = 2;
        s3.name = "om";
        s3.rollno = 3;

        Student std[] = new Student[3];
        std[0] = s1;
        std[1] = s2;
        std[2] = s3;

        for(Student n : std)
        {
            System.out.println(n.name + " : " + n.rollno);
        }
    }
}
