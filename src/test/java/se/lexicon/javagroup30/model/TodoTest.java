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
        testObjectTodo = new Todo(TodoSequencer.nextTodoId(),"Todo description",true, new Person(TodoSequencer.nextTodoId(),"Amer","Rasheed"));
/*
        testObjectTodo.setTodoid(50);
       testObjectTodo.setDescription("Todo description");
        testObjectTodo.setDone(true);
        testObjectTodo.setAssignee();
    */
    }


    @Test
    public void testing_whether_Todo_class_fields_are_correct() {

        //assertEquals(1,"Todo description",true,Muhammad,TodoSequencer.nextTodoId(),testObjectTodo.getDescription(),testObjectTodo.getDone(),testObjectTodo.getAssignee());
//

assertEquals(1,testObjectTodo.getTodoid());
assertEquals("Todo description",testObjectTodo.getDescription());
assertEquals(true, testObjectTodo.getDone());
assertEquals("Amer", testObjectTodo.getAssignee().getFirstName());
assertEquals("Rasheed",testObjectTodo.getAssignee().getLastName());
    }
}
