import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for GradingScheme.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class GradingSchemeTest {

    @Test
    public void testCreateGradingScheme() {
        GradingScheme scheme = new GradingScheme();
        assertNotNull("Grading scheme must not be null", scheme);
    }
}