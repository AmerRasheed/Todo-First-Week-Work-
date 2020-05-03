package se.lexicon.javagroup30;

import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.data.TodoSequencer;
import se.lexicon.javagroup30.model.Person;
import se.lexicon.javagroup30.model.Todo;

/**
 * TODO IT Work
 *
 */
public class App {
    public static void main(String[] args) {

        Person person1 = new Person(PersonSequencer.nextPersonId(), "Muhammad","Yousuf");
        Person person2 = new Person(PersonSequencer.nextPersonId(), "Muhammad", "Salah-Ud-Din");

        System.out.print(person1.getPersonId()+ " ");
        System.out.print(person1.getFirstName()+ " ");
        System.out.print(person1.getLastName()+ "\n");

        System.out.print(person2.getPersonId()+ " ");
        System.out.print(person2.getFirstName()+ " ");
        System.out.print(person2.getLastName()+ "\n");

        Todo thingTodo1 = new Todo(TodoSequencer.nextTodoId(),"First thing done", true);
        Todo thingTodo2 = new Todo(TodoSequencer.nextTodoId(),"Second thing done", true);

        System.out.print(thingTodo1.getTodoid()+ " ");
        System.out.print(thingTodo1.getDescription()+ " ");
        System.out.print(thingTodo1.isDone()+ "\n");

        System.out.print(thingTodo2.getTodoid()+ " ");
        System.out.print(thingTodo2.getDescription()+ " ");
        System.out.print(thingTodo2.isDone()+ "\n");




    }
}



  /*
    //    Person amer = new Person("Usman","Iftikhar");                //If a constructor is called with parameters the error will occur until we create Person CONSTRUCOR without parameters
      Person amer = new Person();
          amer.getPersonId();
        amer.setFirstName("Amer");
       amer.setLastName("Rasheed");

        Todo todoList = new Todo();
       // todoList.setTodoid(45);
        todoList.setDescription("To do IT");

        System.out.println("Todo Id is "+ todoList.getTodoid());
        System.out.println("explanation is " + todoList.getDescription());


        //   todoList.setDescription("Describe");
     //    todoList.setDone(true);
      //  todoList.setAssignee(amer);                 // problem is how we can set some value to PERSON class??

        //odoList.assignee.getFirstName();        // We can get todolist.assignee by making assignee PUBLIC in Todo class
        //Todo. TodoPersonAccess = new Person();    // from net

       // System.out.println("First Name of the person is " + amer.getFirstName());
       // System.out.println("Last Name of the person is " + amer.getLastName());
        //  System.out.println("Id is " + amer.getPersonId());

       // System.out.println("explanation is " + todoList.getDescription());              // Not allowing to getdescription as in the case above
                                                                                        // System.out.println("explanation is" + new Todo());
                                                                                        // I tried this and it worked mysteriously
       // System.out.println("Checking job done " + todoList.isDone());
       // Person avariable = todoList.getAssignee();
       // System.out.println("Person info is " + todoList.getAssignee());                    // cannot assign value to Person
                                                                         // FOR THIS, we have to assign value to a variable of type Person and then GET their fields
      //  System.out.println(avariable.getFirstName());
       // System.out.println(avariable.getLastName());

    }
}


//When declaring constructor, The values cannot be set.
//final

*/
