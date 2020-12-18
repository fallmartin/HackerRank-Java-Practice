
import java.util.*;

class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution {

    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Collect the total number of students from input
        int testCases = Integer.parseInt(scanner.nextLine());

        // Create and populate a new array list using a while loop and testCases
        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator c = Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId);
        
        Collections.sort(studentList, c);

        // Print the st in the console
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
