import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for GradebookCategory.java
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class GradebookCategoryTest {
   /** Category object used for testing. */
    GradebookCategory category;

    /** 
     * Sets up category object for tests.
     */
    @Before
    public void intialize() {
         category = new GradebookCategory("Test", (float) 1.00);
    }

    /**
     * Tests category instantiation. 
     */ 
    @Test
    public void testCreateGradebookCategory() {
        assertNotNull("Gradebook category must not be null", category);
    }

    @Test
    public void testGetName() {
        assertEquals("Gradebook category name must be 'Test'.", "Test", 
            category.getName());
    }

    @Test
    public void testGetWeight() {
        assertEquals("Gradebook category weight must be 1.00", 1.00, 
            category.getWeight(), 0.001);
    }
}