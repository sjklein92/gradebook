import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for GradebookItem.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class GradebookItemTest {
    GradebookItem item;

    @Before
    public void initialize() {
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        item = new GradebookItem(100, test);
    }
    @Test
    public void testCreateGradebookItem() {
        assertNotNull("New gradebook item must not be null", item);
    }

    @Test
    public void testGetScore() {
        assertEquals("Score must be 100", 100, item.getScore());
    }

    @Test
    public void testGetCategory() {
         assertNotNull("Item must have a category.", item.getCategory());
    }
}