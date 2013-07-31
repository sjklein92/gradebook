package gradebook.model;

import java.util.ArrayList;

/** Grading algorithm to be used in calculating score averages and letter
 * grades.
 * @author sklein8@gatech.edu*/
public class GradingScheme {

    /**
     * Calculates the average score for all gradebook items in an ArrayList.
     * @param gradedItems The items which scores are to be averaged.
     * @return avg The average for all scores in the gradebook item ArrayList.
     */
    public final int calculateAvg(final ArrayList<GradebookItem> gradedItems) {
        int avg = 0;
        for (GradebookItem item : gradedItems) {
            avg += item.getScore() * item.getCategory().getWeight();
        }
        return avg;
    }
}
