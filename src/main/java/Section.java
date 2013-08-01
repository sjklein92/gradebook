package gradebook.model;

import java.util.ArrayList;

/**
 * A list of students enrolled in a particular class.
 * @author sklein8@gatech.edu
 *
 */
public class Section extends DetermineGrade {

    /** Name of the Section */
    private String name;

    /** ArrayList of students in the section. */
    private ArrayList<Student> students;

    /**
     * Default Constructor.
     */
    public Section(final String newName) {
        name = newName;
        students = new ArrayList<Student>(0);
    }

    /**
     * Adds a student to the section.
     * @param student The student to be added.
     */
    public final void addStudent(final Student student) {
        students.add(student);
    }

    /**
     * Retreives average score for the section.
     * @return The average score of all students in the section
     */
    public final int getAvgScore() {
        int studentAvgSum = 0;
        for (Student student : students) {
            studentAvgSum += student.getAvgScore();
        }
        return studentAvgSum / students.size();
    }

    /**
     * Accessing method for the ArrayList of students.
     * @return The ArrayList of students.
     */
    public final ArrayList<Student> getStudents() {
        return students;
    }

}
