import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();
        Queue<Student> queue = new PriorityQueue<>(events.size(), new Comparator<Student>() {
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
        int studentId;
        String studentName;
        double studentCgpa;
        for (String event : events) {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] studentEvent = event.split("\\s");
                studentName = studentEvent[1];
                studentCgpa = Double.valueOf(studentEvent[2]);
                studentId = Integer.valueOf(studentEvent[3]);
                queue.add(new Student(studentId, studentName, studentCgpa));
            }
        }
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}
