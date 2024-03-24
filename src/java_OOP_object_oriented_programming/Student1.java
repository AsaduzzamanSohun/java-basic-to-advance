package java_OOP_object_oriented_programming;

public class Student1 {


    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Asad";
        student.id = 31;
        student.gender = "Male";
        student.dept = "CSE";
        student.address = "Dhaka";

        System.out.println(student.name);
        System.out.println(student.id);
        System.out.println(student.gender);

//        ----------------------------------------------

        Student student1 = new Student();

        student1.name = "Raisa";
        student1.id = 34;
        student1.gender = "Female";

        System.out.println(student1.name);
        System.out.println(student1.id);
        System.out.println(student1.gender);


    }

}
