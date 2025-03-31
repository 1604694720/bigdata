package homework;

public class Test3_28_5 {
    public static void main(String[] args) {
        Student student = new Student();
        Classes classes = new Classes();
        student.cls = classes;
        classes.name = "14";
        System.out.println(student.cls.name);
    }
}
