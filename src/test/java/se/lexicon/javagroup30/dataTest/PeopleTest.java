package se.lexicon.javagroup30.dataTest;

import org.junit.*;
import se.lexicon.javagroup30.data.People;
import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.model.Person;

public class PeopleTest {
    Person testPerson = new Person(PersonSequencer.nextPersonId(),"Test String 1","Test String 2");
    People p;
    @Before
    public void setUp() throws Exception {

         p= new People();
    }

    @Test
    public void Test_to_check_addPerson_method_whether_persons_are_being_added_to_already_created_array_of_PERSONS() {

        Assert.assertEquals("Test String 1", p.addPerson(testPerson.getFirstName(),testPerson.getLastName()).getFirstName());
        Assert.assertEquals("Test String 2",p.addPerson(testPerson.getFirstName(),testPerson.getLastName()).getLastName());
    }

  //  @Test
   // public void Check_remove_method_whether_it_removes_an_object_and_returns_boolean() {
  //   Assert.assertEquals(1,p.remove(testPerson.getPersonId()));
  //  }


    @Test
    public void Test_findAll_Method_in_People_Class_to_check_HOW_many_persons_there() {
       Person []  expected = p.findAll();

        Assert.assertArrayEquals(expected, p.findAll());

    }

    @Test
    public void Test_to_check_findById_method_whether_a_person_is_present() {
        //Person testPerson = new Person(PersonSequencer.nextPersonId(),"Test string 1","Test string 2");

       // People p = new People();

Person expected =  null;

        Assert.assertEquals(expected, p.findById(testPerson.getPersonId()));

    }

    @Test
    public void Test_to_check_CLEAR_method() {

               // Assert.assertArrayEquals(testPerson, p.clear());

    }


@Test
public void Test_to_check_size_method_to_check_length_of_person_array() {

    //People p = new People();
    int num=0;
    Assert.assertEquals(num, p.size());

}


/*
    @After
    public static void afterClass() throws Exception {
        PersonSequencer.reset();
            }
*/
}

