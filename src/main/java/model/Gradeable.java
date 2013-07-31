package gradebook.model;

/**
 * Interface for grading various materials.
 *
 * @author sklein8@gatech.edu
 */
public interface Gradeable {

    /** Minimum for a grade "A". */
    int A = 90;

    /** Minimum for a grade "B". */
    int B = 80;

    /** Minimum for a grade "C". */
    int C = 70;

    /** Minimum for a grade "D". */
    int D = 60;

    /**
     * Obtains the average score of all items within the object.
     * @return The average score.
     */
    int getAvgScore();

    /**
     * Obtains the letter grade based on the average score.
     * @return The letter grade.
     */
    String getGrade();
}
