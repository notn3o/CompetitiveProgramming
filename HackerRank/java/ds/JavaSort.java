import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<Student> students = new ArrayList<Student>();
        while (t-- > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() == s2.getCgpa()) {
                    if (s1.getName().equals(s2.getName())) {
                        return s1.getId() - s2.getId();
                    }
                    return s1.getName().compareTo(s2.getName());
                }
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
