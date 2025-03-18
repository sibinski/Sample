import static java.io.IO.println;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Good morning!!!");
        Example example = new Example();
        System.out.println("Your new grade is: " + example.Grade);
        Sample sample = new Sample();
        String student_name = sample.name();
        String subject = sample.subject();
        Integer grade = sample.grade();
        println("This student: " + student_name + " got such a grade: " + grade + " in such subject: " + subject + ".");

    }

    public String name() {
        Example example = new Example();
        example.setName("Jevgeni Sibinski");
        return example.Name;
    }

    public int grade() {
        Example example = new Example();
        example.setGrade(5);
        return example.Grade;
    }

    public String subject() {
        Example example = new Example();
        example.setSubject("Math");
        return example.Subject;
    }
}