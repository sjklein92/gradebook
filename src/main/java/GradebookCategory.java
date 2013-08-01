package gradebook.model;

/**
 * A named or tag applied to GradeBookItems, or named group to which
 * GradebookItems can belong.
 * @author sklein8@gatech.edu
 *
 */
public class GradebookCategory {

    /** The name of the category. */
    private String name;

    /** The grade weight applied to the category. */
    private float weight;

    /**
     * Default Constructor.
     * @param newName Given name of the category.
     * @param newWeight Given weight of the category.
     */
    public GradebookCategory(final String newName, final float newWeight) {
        name = newName;
        weight = newWeight;
    }

    /**
     * Accessing method for the category name.
     * @return name The name of the category.
     */
    public final String getName() {
        return name;
    }

    /**
     * Accessing method for the category's weight.
     * @return weight The weight of the category.
     */
    public final float getWeight() {
        return weight;
    }
}
