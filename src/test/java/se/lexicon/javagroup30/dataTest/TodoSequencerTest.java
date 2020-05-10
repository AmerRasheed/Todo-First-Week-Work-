package se.lexicon.javagroup30.dataTest;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.data.TodoSequencer;

public class TodoSequencerTest {

    @Test
    public void Test_Method_to_check_TODO_counter_sequencer_is_generating_ID() {

        Assert.assertEquals(TodoSequencer.nextTodoId(),1);
    }

    @Test
    public void Test_to_ensure_that_TODO_counter_sequencer_is_set_to_null() {
        int num2=0;
       // Assert.assertEquals(TodoSequencer.reset(),0);
    }
}
