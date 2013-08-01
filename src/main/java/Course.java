package gradebook.model;

import java.util.ArrayList;

/**
 * A defined semester-long treatment of a set of material within a larger
 * subject.
 *
 * @author sklein8@gatech.edu
 *
 */
public class Course extends DetermineGrade {
    /** ArrayList of classes in the course. */
    private ArrayList<GradedClass> classes;

    /** Subject name of the course. */
    private String subject;

    /** The ID number of the course. */
    private int courseNumber;

    /** Array of the prerequisites' respective course numbers. */
    private int[] prerequisites;

    /**
     * Default Constructor.
     * @param newSubject Given subject name of the course.
     * @param newCourseNumber Given ID number of the course.
     * @param newPrerequisites Given array of prerequisite course numbers.
     */
    public Course(final String newSubject, final int newCourseNumber,
            final int[] newPrerequisites) {
        subject = newSubject;
        classes = new ArrayList<GradedClass>(0);
        courseNumber = newCourseNumber;
        prerequisites = newPrerequisites;
    }

    /**
     * Adds a class to the course.
     * @param newClass Given class to be added.
     */
    public final void addClass(GradedClass newClass) {
        classes.add(newClass);
    }

    /**
     * Drops a specified class from the course.
     * @param dropClass Given class to be dropped.
     */
    public final void dropClass(GradedClass dropClass) {
        classes.remove(dropClass);
    }

    /**
     * Accessing method for the subject name.
     * @return subject The name of the subject.
     */
    public final String getSubject() {
        return subject;
    }

    /**
     * Accessing method for the course number.
     * @return courseNumber The course number.
     */
    public final int getCourseNumber() {
        return courseNumber;
    }

    /**
     * Accessing method for course prerequisites.
     * @return prerequisites The array of prerequisite course numbers.
     */
    public final int[] getPrerequisites() {
        return prerequisites;
    }

    /**
     * Retrieves average score of all classes.
     * @return The average score for all sections combined.
     */
    public final int getAvgScore() {
        int classAvgSum = 0;
        for (GradedClass gradedClass : classes) {
            classAvgSum += gradedClass.getAvgScore();
        }
        return classAvgSum / classes.size();
    }

    /**
     * Accessing method for classes.
     * @return classes The available classes in the course.
     */
    public final ArrayList<GradedClass> getClasses() {
        return classes;
    }
}
