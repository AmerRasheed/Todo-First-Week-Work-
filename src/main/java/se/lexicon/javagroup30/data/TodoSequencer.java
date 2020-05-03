package se.lexicon.javagroup30.data;

public class TodoSequencer{
    private static int todoid=0;

    public static int nextTodoId(){
        return ++todoid;
    }

    public static void reset(){
        todoid=0;
    }
}