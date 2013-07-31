package gradebook.model;

import java.util.ArrayList;

/**
 * An individual enrolled in a course.
 * @author sklein8@gatech.edu
 *
 */
public class Student extends DetermineGrade {

    /** The student's name. */
    private String name;

    /** ArrayList of the student's graded materials. */
    private ArrayList<GradebookItem> gradedItems;

    /** Grading algorithm to be used for the student's materials. */
    private GradingScheme scheme;

    /**
     * Default Constructor.
     * @param newName Given name of the student.
     */
    public Student(final String newName) {
        name = newName;
        gradedItems = new ArrayList<GradebookItem>();
    }

    /**
     * Adds a graded item to the student's ArrayList of graded materials.
     * @param item The new graded material.
     */
    public final void addGradebookItem(final GradebookItem item) {
        gradedItems.add(item);
    }

    /**
     * Accessing method for gradebook items.
     * @return gradedItems The ArrayList of graded items.
     */
    public final ArrayList<GradebookItem> getGradedItems() {
        return gradedItems;
    }

    /**
     * Drops the lowest grade of a specified category in the student's
     * gradebook.
     * @param category The type of grade to be selected.
     */
    public final void dropLowestInCategory(final GradebookCategory category) {
        int lowestGrade = 100;
        int itemIndex = 0;
        for (int i = 0; i < gradedItems.size(); i++) {
            GradebookItem currentItem = gradedItems.get(i);
            if ((currentItem.getCategory().equals(category))
                    && (currentItem.getScore() < lowestGrade)) {
                lowestGrade = currentItem.getScore();
                itemIndex = i;
            }
        }
        gradedItems.remove(itemIndex);
    }

    /**
     * Replaces the current grading algorithm with a new one.
     * @param newScheme The new grading scheme to be used.
     */
    public final void updateScheme(final GradingScheme newScheme) {
        scheme = newScheme;
    }

    /**
     * Accessing method for the student's grading scheme.
     * @return scheme The student's grading scheme.
     */
    public final GradingScheme getScheme() {
        return scheme;
    }

    /**
     * Accessing method for the student's name.
     * @return The student's name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Produces the student's overall score using the grading algorithm.
     * @return The student's average score.
     */
    public final int getAvgScore() {
        return scheme.calculateAvg(gradedItems);
    }

}
