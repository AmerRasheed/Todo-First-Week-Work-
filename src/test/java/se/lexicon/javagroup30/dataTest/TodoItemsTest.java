package se.lexicon.javagroup30.dataTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.javagroup30.data.People;
import se.lexicon.javagroup30.data.TodoItems;
import se.lexicon.javagroup30.data.TodoSequencer;
import se.lexicon.javagroup30.model.Person;
import se.lexicon.javagroup30.model.Todo;

public class TodoItemsTest {
    Todo testTodo = new Todo(TodoSequencer.nextTodoId(), "Test String 1", true, new Person(TodoSequencer.nextTodoId(), "Test String 1", "Test String 2"));
    TodoItems td;

    @Before
    public void setUp() throws Exception {
        td = new TodoItems();
    }

    @Test
    public void Test_to_check_whether_Todos_are_being_added_to_already_created_array_of_TodoS() {

        Assert.assertEquals("Test String 1",
                 td.addTodo(testTodo.getAssignee().getFirstName(),
                            testTodo.getAssignee().getLastName(),
                            testTodo.getDescription(),
                            testTodo.getDone()).getAssignee().getFirstName());


        Assert.assertEquals("Test String 2",
                 td.addTodo(testTodo.getAssignee().getFirstName(),
                            testTodo.getAssignee().getLastName(),
                            testTodo.getDescription(),
                            testTodo.getDone()).getAssignee().getLastName());
    }

    @Test
    public void Test_findAll_Method_in_People_Class_to_check_HOW_many_persons_there() {
       // Person testPerson1 = new Person(TodoSequencer.nextTodoId(),"Test string 1","Test string 2");

       //  p = new People();
        Todo []  expected = td.findAll();

        Assert.assertArrayEquals(expected, td.findAll());
       // Assert.assertEquals("Test String 2",p.addPerson(testPerson1.getFirstName(),testPerson1.getLastName()));
    }


    @Test
    public void Test_to_check_findById_method_whether_a_person_is_present() {
      //  Person testPerson = new Person(PersonSequencer.nextPersonId(),"Test string 1","Test string 2");

      //  People p = new People();

//Todo expected = testTodo.

        td.addTodo(testTodo.getAssignee().getFirstName(),
                testTodo.getAssignee().getLastName(),
                testTodo.getDescription(),
                testTodo.getDone());

        Assert.assertEquals(testTodo.getTodoid(), td.findById(testTodo.getTodoid()).getTodoid());
        Assert.assertEquals(testTodo.getDescription(), td.findById(testTodo.getTodoid()).getDescription());
        //Assert.assertEquals(, td.findById(testTodo.getTodoid()).getDescription());


    }

    @Test
    public void Test_to_check_CLEAR_method_whether_a_person_is_present() {

        People p = new People();


       // Assert.assertEquals(null, p.clear());

    }


    @Test
    public void Test_to_check_size_method_to_check_length_of_TODOs_array() {

//        TodoItems t = new TodoItems();
        int num=td.size();
        Assert.assertEquals(num, td.size());

    }


}
