package secondtry.student;
        import java.util.ArrayList;
        import java.util.Arrays;
public class Student {
    private String name;
    private double gpa;
    ArrayList<String> courses;
    public Student(String name, double gpa, String ... courses) {
        if (isValid(name, gpa)) {
            this.name = name;
            this.gpa = gpa;
            this.courses = new ArrayList<String>(Arrays.asList(courses));
        } else {
            throw new IllegalArgumentException("Bad name or gpa for Student");
        }
    }
    public static boolean isValid(String name, double gpa) {
        return gpa >= 0.0 && gpa <= 5.0 && name != null && name.length() > 0;
    }
}