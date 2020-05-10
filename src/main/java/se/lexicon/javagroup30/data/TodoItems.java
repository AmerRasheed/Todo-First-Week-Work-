package se.lexicon.javagroup30.data;

import com.sun.xml.internal.bind.v2.TODO;
import se.lexicon.javagroup30.model.Person;
import se.lexicon.javagroup30.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] Todos = new Todo[0];

    public int size() {

        return Todos.length;
    }

    public Todo[] findAll() {
        return Todos;
    }

    public Todo findById(int TodoId) {

        Todo[] newarray = new Todo[0];
        Todo send = null;
        for (Todo name : Todos) {

            if (name.getTodoid() == TodoId)
                send = name;
        }
        return send;
    }

    public Todo addTodo(String todoName, String todolastName, String tododesc,Boolean todoDone) {
        Todo todothing = new Todo(TodoSequencer.nextTodoId(), tododesc, todoDone, new Person(PersonSequencer.nextPersonId(),todoName, todolastName));
        Todos = Arrays.copyOf(Todos, Todos.length + 1);
        Todos[Todos.length - 1] = todothing;
        return todothing;

    }

    public void clear() {
        Todos = new Todo[0];
    }



    public Todo[] findByDoneStatus(boolean doneStatus){
        Todo[] newDonearray = new Todo[0];
        for(int i=0;i<Todos.length;i++)
        {
            if(Todos[i].getDone()==true)
            {
                newDonearray[i]=Todos[i];
            }
        }
        return newDonearray;
    }

    public Todo[] findByAssignee(int personId){

        for(int i=0;i<Todos.length;i++)
            if(Todos[i].getTodoid()==personId)
            {
                return Todos;
            }
        return null;
    }

    public Todo[] findByAssignee(Person assignee)
    {

        for(int i=0;i<Todos.length;i++)
            if(Todos[i].getAssignee()==assignee)    // Is it Persons in Todos
            {
                return Todos;
            }
        return null;

    }


    public Todo[] findUnassignedTodoItems(){
        Todo[] checkAssignees = new Todo[0];
        for(int i=0;i<Todos.length;i++)
        //if(Todos[i].s
        {
            //  checkAssignees[i]=Todos[i].getAssignee();
        }
        return checkAssignees;
    }

    public boolean remove(int ToId){

        // boolean isremoved=false;
        //3 Rana
        //4 Mustansar
        //5 Hamid

        boolean flagTD=false;
        int TDsize = Todos.length;
        //System.out.println("o edhar"+TDsize);
        Todo[] toremoveTD = new Todo[0];
        Todo[] before = new Todo[TDsize];
        Todo[] after = new Todo[TDsize];
        Todo[] after1 = Arrays.copyOf(after,after.length+1);
        Todo[] combined = new Todo[TDsize-1];
        int index=0;
        int beforeind=0;
        int afterind=0;
        int combindex=0;
        for(int i=0;i<Todos.length;i++)
        {
             if(Todos[i]==null)
                 System.out.println("No element found in the TodoItems array");
             else if(Todos[i].getTodoid()==ToId)
                index=i;
        }

        for(int i=0;i<Todos.length;i++)
        {
            if(i<index)
            {
                before[i] = Todos[i];
                beforeind++;
                combindex++;
            }
            else
            {
                if(i==2) {
                    after1[i] = Todos[i];

                }
                else
                    after1[i] = Todos[i + 1];

                //System.out.println(after1[i].getFirstName());
                // System.out.println(persons[i].getFirstName());
                afterind++;
                combindex++;
            }
        }
        //Person[] combined1 = Arrays.copyOf(combined,combined.length+1);
        for(int i=0;i<combindex-1;i++) {
            if(i<beforeind)
                combined[i]=before[i];
            else
            {combined[i]=after1[i];
            flagTD=true;
            }
        }
        //for(int i=0;i<any.length;i++) //Todo-> Person-> fields
        //  System.out.println((any[i].getAssignee().getFirstName()));
        for(int i=0;i<TDsize-1;i++)
            System.out.println(combined[i].getAssignee().getFirstName());
        return flagTD;
    }







}




