package school;

public class Student {
    String name;
    double gpa;
    public Student(String name,double gpa)
    {
        if (isValid(name, gpa)) {
            this.name = name;
            this.gpa = gpa;
        } else {

            throw new IllegalArgumentException("name or gpa for Student is wrong");
        }
    }
    public static boolean isValid(String name, double gpa) {
        return gpa >= 0.0 && gpa <= 5.0 && name != null && name.length() > 0;
    }
}
