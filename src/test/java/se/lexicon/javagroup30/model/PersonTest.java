package se.lexicon.javagroup30.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.data.TodoSequencer;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person testObjectPerson;


    @Before
    public void setUp() throws Exception {
      //  testObject = new Person("a","b");  // In this scenario, assigning Nadeem vaxjo value will not create any effect.
                                           //Eftersom in third and last line, the values are set with ”Test” and ”Test LastName”.

        testObjectPerson = new Person( PersonSequencer.nextPersonId(),"Test","Test Last Name");

/*
       testObjectPerson.
        testObjectPerson.setFirstName("Test");
        testObjectPerson.setLastName("Test Last Name");
*/

    }

    @Test                     //For testing Person Class
    public void testobject_for_Peson_class_That_either_correct_fieldsare_OK_for_FIRST_ID_incremen() {
        assertEquals(1,testObjectPerson.getPersonId());
        assertEquals("Test", testObjectPerson.getFirstName());
        assertEquals("Test Last Name", testObjectPerson.getLastName());
    }


    @Test                     //For testing Person Class
    public void testobject_for_Peson_class_That_either_correct_fieldsare_OK_for_FIRST_ID_increment_for_Incrementing_Second_Time() {
        assertEquals(2,testObjectPerson.getPersonId());
        assertEquals("Test", testObjectPerson.getFirstName());
        assertEquals("Test Last Name", testObjectPerson.getLastName());
    }

/*
    @After
    public static void afterClass() throws Exception {
        PersonSequencer.reset();
    }
*/

}
