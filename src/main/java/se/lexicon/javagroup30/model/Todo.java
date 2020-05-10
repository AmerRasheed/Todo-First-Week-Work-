package se.lexicon.javagroup30.model;

public class Todo {
   // private static int todocounter=0;

    //final int todoid=0;   //final int todoid= Integer.parseInt(null);  TRY THIS
    final int todoid;
    String description;
    boolean done;
    Person assignee;        //Outer class variable


    //Constructor
        public Todo(int todoid, String description, boolean done, Person assignee) /* parameters being passed including assignee of type PERSON*/
        {

        this.todoid = todoid;                                       //Error may be its already assigned??
        this.description = description;
        this.done =done;
        this.assignee=assignee;

    }


/*
    public Todo(int todoid, String description) {
        this.todoid = todoid;
        this.description = description;
        this.done = done;
        this.assignee = assignee;
    }
*/
    public Todo(int todoid) {
        this.todoid = todoid;
    }



    //Getters and Setters

    public int getTodoid() {
        return todoid;
    }
/*
    public void setTodoid(int todoid) {
        this.todoid = todoid;
    }
*/
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() { // I removed method parameters like we have in case of firstname or lastname in Person
        return description;
    }


    public void setDone(boolean done) {
        this.done = done;
    }


    public boolean getDone() {
        return done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee() {

        this.assignee = assignee;


    //this.assignee = assignee;



    }
                             //   With the following setting. That is removing parameters REMOVES the error
  /*  public void setAssignee() {
        this.assignee = assignee;
    }
*/

}
