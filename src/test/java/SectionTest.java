import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for Section.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class) 
public class SectionTest {
    Section section;

    /**
     * Sets up a new Section with a single student.
     */
    @Before
    public void initialize() {
        section = new Section();
        Student student = new Student("John Doe");
        student.updateScheme(new GradingScheme());
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        GradebookItem item = new GradebookItem(100, test);
        student.addGradebookItem(item);
        section.addStudent(student);
    }

    @Test
    public void testCreateSection() {
        assertNotNull("Section must not be null", section);
    }

    @Test
    public void testAddStudent() {
        assertFalse("Students ArrayList must not be empty", 
            section.getStudents().isEmpty());
    }

    @Test
    public void testGetAvgScore() {
        int avgScore = section.getAvgScore();
        assertEquals("Section average must be 100", 100, avgScore);
    }
}