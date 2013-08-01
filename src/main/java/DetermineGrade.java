package gradebook.model;

/**
 * @author sklein8@gatech.edu
 *
 */
public abstract class DetermineGrade implements Gradeable {

    /**
     * Performs evaluation of average score by letter grade.
     * @param avgScore The average score.
     * @return The letter grade of the evaluated average.
     */
    public final String determineGrade(final int avgScore) {
        if (avgScore >= A) {
            return "A";
        } else if ((avgScore < A) && (avgScore >= B)) {
            return "B";
        } else if ((avgScore < B) && (avgScore >= C)) {
            return "C";
        } else if ((avgScore < C) && (avgScore >= D)) {
            return "D";
        } else {
            return "F";
        }
    }

    /**
     * Retrieves the grade of the average score.
     * @return The letter grade of the evaluated average.
     */
    public final String getGrade() {
        int avgScore = getAvgScore();
        String grade = determineGrade(avgScore);
        return grade;
    }
}

