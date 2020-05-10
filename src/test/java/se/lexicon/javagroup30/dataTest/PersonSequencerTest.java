package se.lexicon.javagroup30.dataTest;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.javagroup30.data.PersonSequencer;

public class PersonSequencerTest {

    @Test
    public void Test_Method_to_check_Person_counter_sequencer_is_generating_ID() {

        Assert.assertEquals(PersonSequencer.nextPersonId(),1);
    }
    @Test
    public void Test_Method_to_check_Person_counter_sequencer_is_generating_I888D() {

        Assert.assertEquals(PersonSequencer.nextPersonId(),2);
    }

    @Test
    public void Test_to_ensure_that_Person_counter_sequencer_is_set_to_null() {
        int num2=0;

        //PersonSequencer.reset();
     //   Assert.assertEquals(PersonSequencer.reset(),0);
    }
}
