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
     */
    public GradedClass(final String newName) {
        name = newName;
        sections = new ArrayList<Section>(0);
    }

    /**
     * Adds new sections to the class.
     * @param numberOfSections Number of sections to be added.
     */
    public final void addSection(final Section newSection) {
        sections.add(newSection);
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
