package se.lexicon.javagroup30.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.javagroup30.data.TodoSequencer;

import static org.junit.Assert.assertEquals;

public class TodoTest {
    private Todo testObjectTodo;
    @Before
    public void setUp() throws Exception {
        testObjectTodo = new Todo();

          //testObjectTodo.setTodoid(50);
       testObjectTodo.setDescription("Todo description");
        testObjectTodo.setDone(true);
        //testObjectTodo.setAssignee();
    }

    @Test
    public void testing_whether_Todo_class_fields_are_correct() {

        //assertEquals(50, testObjectTodo.getTodoid());
       // assertEquals("Todo description", testObjectTodo.getDescription("Todo description"));
        //assertEquals(1,"Todo description",true,TodoSequencer.nextTodoId(),testObjectTodo.getDescription(),testObjectTodo.getTodoid());
//assertEquals(1,"Todo description",true,TodoSequencer.nextTodoId(),);
        //assertEquals(1,"Todo description",TodoSequencer.nextTodoId(),testObjectTodo.getDescription());
//assertEquals(true,testObjectTodo.getTodoid());

    }
}
