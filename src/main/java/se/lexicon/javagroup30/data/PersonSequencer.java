package se.lexicon.javagroup30.data;

public class PersonSequencer {
    private static int personid=0;

    public static int nextPersonId(){
        return ++personid;
    }

    public static void reset(){

       personid=0;
        // personid=0;
        //        return personid;
    }
}
