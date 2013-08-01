import gradebook.model.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for Student.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class StudentTest {

    private Student student;

    @Before
    public void initialize() {
        student = new Student("John Doe");
    }

    @Test
    public void testCreateStudent() {
        assertNotNull("Student object must be instantiated", student);
    }



    @Test
    public void testAddGradebookItem() {
        GradebookCategory test = new GradebookCategory("Test", (float) 0.50);
        GradebookItem item = new GradebookItem(100, test);
        student.addGradebookItem(item);
        assertFalse("Student's graded" +
                "items must not be empty.", 
                student.getGradedItems().isEmpty());
    }

    @Test
    public void testGetGradebookItems() {
        assertTrue("Student must produce an ArrayList when prompted.", 
            student.getGradedItems() instanceof ArrayList);
    }

    @Test
    public void testDropLowestInCategory() {
        initialize();
        addSampleTests();
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        student.dropLowestInCategory(test);
        int grade = student.getGradedItems().get(0).getScore();
        assertEquals("Highest grade must be 100.", 100, 
                grade);
        
    }

    public void addSampleTests() {
        GradebookCategory test = new GradebookCategory("Test", (float) 1.00);
        GradebookItem lowScore = new GradebookItem(25, test);
        student.addGradebookItem(lowScore);
        GradebookItem highScore = new GradebookItem(100, test);
        student.addGradebookItem(highScore);
    }

    @Test
    public void testGetAvgScore() {
        initialize();
        addSampleTests();
        int avgScore = student.getAvgScore();
        assertEquals("Average score must be 62.", 62, avgScore);
    }

    @Test
    public void testGetGrade() {
        initialize();
        addSampleTests();
        String grade = student.getGrade();
        assertEquals("Student grade must be 'D'.", "D", grade);
    }
}