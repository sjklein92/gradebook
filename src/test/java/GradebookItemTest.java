import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
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

    @Test
    public void testCreateGradebookItem() {
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        GradebookItem item = new GradebookItem(100, test);
        assertNotNull("New gradebook item must not be null", item);
    }
}