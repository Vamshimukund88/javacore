package arrays;


public class TestArrayStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 40;
        s1.name  = "Vamshi";
        s1.rollno = 52;

        Student s2 = new Student();
        s2.name = "Nag";
        s2.rollno = 23;
        s2.marks = 34;

        //Create Array to fetch the values of the all student

        Student stud[] = new Student[2];

        stud[0] = s1;
        stud[1] =s2;
        //enhanced forloop
        for(Student students : stud)
        {
            System.out.println(students.name +  " : "+ students.rollno+ " = "+students.marks );
        }

    }
}
class Student
{
    int rollno;
    int marks;
    String name;
}


