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
                                                                         /*Here tricky part was to pass Person type class parameters */
                                                                          /*Here Todosequencer is generating ID*/
                                                                          /*"Amer" is the firstName and "Rasheed" is the lastName (From Person type)*/

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
assertEquals("Amer", testObjectTodo.getAssignee().getFirstName());    /*Here "Amer" is being compared with Person type variable assignee
                                                                                and then with firstName of Peson
                                                                                 The sequence is testobject->
                                                                                 get Todo class+Person class variable assignee ->
                                                                                 Person class firstName variable */
assertEquals("Rasheed",testObjectTodo.getAssignee().getLastName());
    }
}
