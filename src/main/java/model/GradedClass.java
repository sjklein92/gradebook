package gradebook.model;

import java.util.ArrayList;

/**
 * Class object that stores sections, reports score averages and reports grades.
 *
 * @author sklein8@gatech.edu
 */
public class GradedClass extends DetermineGrade {

    /** Arrangement of sections in the class. */
    private ArrayList<Section> sections;

    /** Name of the school class. */
    private String name;

    /**
     * Default Constructor.
     * @param newName Name of the class.
     * @param numberOfSections Number of requested sections in the class.
     */
    public GradedClass(final String newName, final int numberOfSections) {
        name = newName;
        addSections(numberOfSections);
    }

    /**
     * Adds new sections to the class.
     * @param numberOfSections Number of sections to be added.
     */
    final void addSections(final int numberOfSections) {
        sections = new ArrayList<Section>(numberOfSections);
        for (int i = 0; i < sections.size(); i++) {
            sections.add(new Section());
        }
    }

    /**
     * Accessing method for name.
     * @return name Name of the class.
     */
    public final String getName() {
        return name;
    }

    /**
     * Retrieves average score of all sections.
     * @return The average score for all sections combined.
     */
    public final int getAvgScore() {
        int sectionAvgSum = 0;
        for (Section section : sections) {
            sectionAvgSum += section.getAvgScore();
        }
        return sectionAvgSum / sections.size();
    }

    /**
     * Accessing method for sections ArrayList.
     * @return sections the ArrayList of sections.
     */
    public final ArrayList<Section> getSections() {
        return sections;
    }
}
