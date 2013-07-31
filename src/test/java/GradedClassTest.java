import gradebook.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

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
    GradedClass gradedClass;
    
    @Before
    public void initialize () {
        gradedClass = new GradedClass("Summer", 5);
    }
    
    @Test
    public void testCreateClass () {
        assertNotNull("Class must not be null", gradedClass);
        assertEquals("Name of class must be 'Summer'", "Summer", 
                gradedClass.getName());
    }    
}

