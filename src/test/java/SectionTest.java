package gradebook.model;
import gradebook.model.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

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
        section = new Section("A");
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
        initialize();
        int avgScore = section.getAvgScore();
        assertEquals("Section average must be 100", 100, avgScore);
    }

    public void buildHeirarchy() {
        Student student = new Student("John Doe");
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        GradebookItem item = new GradebookItem(100, test);
        student.addGradebookItem(item);
        section.addStudent(student);
    }

    @Test
    public void testGetStudents() {
        assertTrue("Section must produce an ArrayList when prompted", 
            section.getStudents() instanceof ArrayList);
    }

    @Test
    public void testGetGrade() {
        initialize();
        buildHeirarchy();
        assertEquals("Section grade must be A", "A", section.getGrade());
    }
}