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
        assertNotNull("Course must not be null", course);
    }

    /**
     * Tests class addition
     */
    @Test
    public void testAddClass() {
        GradedClass newClass = new GradedClass("Summer");
        course.addClass(newClass);
    }

    /**
     * Tests subject name getter method. 
     */
    @Test
    public void testGetSubject() {
        assertEquals("Course subject must be 'Objects & Design'.", 
            "Objects & Design", course.getSubject());
    }

    /**
     * Tests course number getter method
     */
    @Test
    public void testGetCourseNumber() {
        assertEquals("Course number must be 2340.", 
            2340, course.getCourseNumber());
    }

    /**
     * Tests prerequisites getter method
     */
    @Test
    public void testGetPrerequisites() {
        assertEquals("Course prequisites must contain 1331", 
                1331, course.getPrerequisites()[0]);
    }

    /**
     * Tests average retreival method
     */
    @Test
    public void testGetAvgScore() {
        initialize();
        buildHierarchy();
        int courseAvg = course.getAvgScore();
        assertEquals("Course average must be 77.", 77, courseAvg);
    }

    @Test
    public void testGetGrade() {
        initialize();
        buildHierarchy();
        assertEquals("Course grade must be a C", "C", course.getGrade());
    }

    /**
     * Helper method to substantiate course with grades, a student, 
     *  a section, and a class.
     */
    public void buildHierarchy() {
         GradebookCategory testCategory 
            = new GradebookCategory("Test", (float) 1.00);

        GradebookItem firstTest = new GradebookItem(75, testCategory);
        GradebookItem secondTest = new GradebookItem(80, testCategory);

        Student newStudent = new Student("John Doe");
        newStudent.addGradebookItem(firstTest);
        newStudent.addGradebookItem(secondTest);

        gradebook.model.Section newSection = new gradebook.model.Section("section1");
        newSection.addStudent(newStudent);

        GradedClass newClass = new GradedClass("Summer");
        newClass.addSection(newSection);

        course.addClass(newClass);
    }


}
