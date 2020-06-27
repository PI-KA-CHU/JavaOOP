import school.Student;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student("A",5,"man","10086");

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getGender());
        System.out.println(stu.getID_NO());
    }
}
