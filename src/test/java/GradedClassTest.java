import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for Course.java
 * 
 * @author sklein8@gatech.edu
 */
@RunWith(JUnit4.class)
public class GradedClassTest
{
    /** Class object used for testing. */
    GradedClass gradedClass;
    
    /**
     * Sets up class for tests.
     */
    @Before
    public void initialize() {
        gradedClass = new GradedClass("Summer");
    }
    
    /**
     * Tests class instatiation.
     */
    @Test
    public void testCreateClass() {
        assertNotNull("Class must not be null", gradedClass);
    }    

    @Test
    public void testAddSection() {
        gradebook.model.Section newSection = 
            new gradebook.model.Section("A");
        gradedClass.addSection(newSection);
    }

    @Test 
    public void testGetName() {
        assertEquals("Name of class must be 'Summer'", "Summer", 
            gradedClass.getName());
    }

    @Test
    public void testGetSections() {
        assertTrue("Class must produce an ArrayList when prompted",
            gradedClass.getSections() instanceof ArrayList);
    }

    @Test
    public void testGetAvgScore() {
        initialize();
        buildHeirarchy();
        int classAvg = gradedClass.getAvgScore();
        assertEquals("Class average must be 77.", 77, classAvg);
    }

    @Test
    public void testGetGrade() {
        initialize();
        buildHeirarchy();
        assertEquals("Class grade must be a C", "C", gradedClass.getGrade());
    }

    public void buildHeirarchy() {
        GradebookCategory testCategory = 
            new GradebookCategory("Test", (float) 1.00);

        GradebookItem firstTest = new GradebookItem(75, testCategory);
        GradebookItem secondTest = new GradebookItem(80, testCategory);

        Student newStudent = new Student("John Doe");
        newStudent.addGradebookItem(firstTest);
        newStudent.addGradebookItem(secondTest);

        gradebook.model.Section newSection = 
            new gradebook.model.Section("section1");
        newSection.addStudent(newStudent);

        gradedClass.addSection(newSection);
    }
}

