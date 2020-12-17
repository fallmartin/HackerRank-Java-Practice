
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class Student {

    // Data fields of the Student class are id, name, and cgpa
    private int id;
    private String name;
    private double cgpa;

    /**
     * Parameterized constructor of the Student class.
     *
     * @param id
     * @param name
     * @param cgpa
     */
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    /**
     * Returns a student's ID number.
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     * Returns a student's name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a student's cumulative grade point average (CGPA).
     *
     * @return
     */
    public double getCGPA() {
        return cgpa;
    }

}

class Priorities {

    /**
     * No args constructor of the Priorities class.
     */
    public Priorities() {
    }

    /**
     * Processes all the given events and returns all the students yet to be
     * served in the priority order.
     *
     * @param events
     * @return
     */
    public List<Student> getStudents(List<String> events) {
        // Create a priority queue instantiated with a comparator
        PriorityQueue<Student> queue = new PriorityQueue<>(
                java.util.Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID));

        // Process the events array of strings
        for (String event : events) {
            // Tokenize each line of input
            String[] tokens = event.split(" ");

            // If the first word of the line is ENTER
            if (tokens[0].equals("ENTER")) {
                int id = Integer.parseInt(tokens[3]);
                String name = tokens[1];
                double cgpa = Double.parseDouble(tokens[2]);
                // Add a new Student to the priority queue
                queue.add(new Student(id, name, cgpa));
            } else if (tokens[0].equals("SERVED")) { // Otherwise
                if (!queue.isEmpty()) {
                    queue.poll(); // Poll the queue for a priority student
                }
            }
        }
        /**
         * We need to poll the priority queue to enforce the priority. If we
         * don't and just create a new array list with a queue parameter in the
         * constructor, we will not retain the desired order of students.
         */

        // Create an array list of students
        ArrayList<Student> list = new ArrayList<>();
        // While the queue is not empty, poll and add students to the array list
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }

        return list; // Return the list to the caller
    }
}

public class Solution {

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
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
