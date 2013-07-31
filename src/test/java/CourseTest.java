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
 * Tests for Class.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class CourseTest {

    /** Course object used for testing. */
    private Course course;

    /** 
     * Sets up a course for testing.
     */
    @Before
    public void initialize() {
        int[] prerequisites = new int[1];
        prerequisites[0] = 1331;
        course = new Course("Objects & Design", 2340, prerequisites);
    }

    /**
     * Tests course instantiation.
     */
    @Test
    public void testCreateCourse() {
        int[] prerequisites = new int[1];
        prerequisites[0] = 1331;
        assertNotNull("Course must not be null", course);
        assertEquals("Course subject must be 'Objects & Design'", 
                "Objects & Design", course.getSubject());
        assertEquals("Course number must be 2340", 2340, 
                course.getCourseNumber());
        assertArrayEquals("Course prequisites must contain 1331", 
                prerequisites, course.getPrerequisites());
    }

    /**
     * Tests subject name getter method. 
     */
    @Test
    public void testGetSubject() {
        assertNotNull("Course must have a valid subject.", course.getSubject());
    }

}
