package gradebook.model;

/**
 * An individual item for which a student receives a score.
 * @author sklein8@gatech.edu
 *
 */
public class GradebookItem {

    /** Score of the gradebook item. */
    private int score;

    /** Category of the gradebook item (e.g. test, quiz, etc.).*/
    private GradebookCategory category;

    /**
     * Default Constructor.
     * @param newScore Given score of the gradebook item.
     * @param newCategory Given category of the gradebook item.
     */
    public GradebookItem(final int newScore,
            final GradebookCategory newCategory) {
        score = newScore;
        category = newCategory;
    }

    /**
     * Accessing method for the score.
     * @return score The score of the gradebook item.
     */
    public final int getScore() {
        return score;
    }

    /**
     * Accessing method for the gradebook category.
     * @return category The category of the gradebook item.
     */
    public final GradebookCategory getCategory() {
        return category;
    }
}
