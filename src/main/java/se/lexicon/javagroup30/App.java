package se.lexicon.javagroup30;
import se.lexicon.javagroup30.data.People;
import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.data.TodoItems;
import se.lexicon.javagroup30.data.TodoSequencer;
import se.lexicon.javagroup30.model.Person;
import se.lexicon.javagroup30.model.Todo;
import java.util.Arrays;

/**
 * TODO IT Work
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("A single Person                    Ref. Person ");
        Person person1 = new Person(PersonSequencer.nextPersonId(), "Muhammad", "Yousuf");
        Person person2 = new Person(PersonSequencer.nextPersonId(), "Muhammad", "Salah-Ud-Din");
        Person person3 = new Person(PersonSequencer.nextPersonId(), "Amer", "Rasheed");
        Person person4 = new Person(PersonSequencer.nextPersonId(), "Erk", "Svensson");
        Person person5 = new Person(PersonSequencer.nextPersonId(), "Tobias", "Johnsson");

        System.out.print(person1.getPersonId() + " ");
        System.out.print(person1.getFirstName() + " ");
        System.out.print(person1.getLastName() + "\n");    //Output 1 Muhammad Yousuf

        System.out.print(person2.getPersonId() + " ");
        System.out.print(person2.getFirstName() + " ");
        System.out.print(person2.getLastName() + "\n");   //2 Muhammad Salah-Ud-Din

        System.out.print(person3.getPersonId() + " ");
        System.out.print(person3.getFirstName() + " ");
        System.out.print(person3.getLastName() + "\n");    //Output 1 Muhammad Yousuf

        System.out.print(person4.getPersonId() + " ");
        System.out.print(person4.getFirstName() + " ");
        System.out.print(person4.getLastName() + "\n");   //2 Muhammad Salah-Ud-Din

        System.out.print(person5.getPersonId() + " ");
        System.out.print(person5.getFirstName() + " ");
        System.out.print(person5.getLastName() + "\n");   //2 Muhammad Salah-Ud-Din

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("People                    Ref. People (Array of persons ");
        People p = new People();
        Person var0 = p.addPerson("Rana", "Waqas");  /*p.addPerson ==== In which person is being called with TWO parameters eftersom addPerson method has two parameters */
        System.out.print(var0.getPersonId() + " ");
        System.out.println(var0.getFirstName());


        System.out.println("Adding Persons to People                    Ref. Q.8 e ");
        Person var1 = p.addPerson("Mustansar", "Khan");

        System.out.print(var1.getPersonId() + " ");
        System.out.println(var1.getFirstName());

        Person var2 = p.addPerson("Hamid", "Pia");
        System.out.print(var2.getPersonId() + " ");
        System.out.println(var2.getFirstName());

        System.out.println("Size of People array is " + p.size());

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Removing Person                    Ref. Q.11");

        boolean removal = p.remove(8);
        if (removal)

            System.out.println("The person is successfully removed ");
        //System.out.println("Size of People array AFTER is "+p.size());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Adding more persons to PEOPLE array");
        Person var3 = p.addPerson("Asad", "Ullah");
        System.out.print(var3.getPersonId() + " ");
        System.out.println(var3.getFirstName());

        Person var4 = p.addPerson("Uffe", "Kock");
        System.out.print(var4.getPersonId() + " ");
        System.out.println(var4.getFirstName());

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Finding all persons in People                    Ref. Q.8 c");
        Person[] peopleArray = p.findAll();

        for (int i = 0; i < peopleArray.length; i++) {
            System.out.print((peopleArray[i].getPersonId()));
            System.out.print(" " + peopleArray[i].getFirstName());
            System.out.println(" " + peopleArray[i].getLastName());
        }

        System.out.println("Size of People array is " + p.size());
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("To do Assginees               Ref. TodoItems");
        TodoItems td = new TodoItems();
        td.addTodo("Handla", "Willys", "Grån saker", true);
        td.addTodo("Byta", "Bil dacker", "på helgen", false);
        td.addTodo("Listen", "Lecture", "Udemi", false);

        System.out.println("Removing TodoItems                                    Ref.Q.11");
        Todo[] any = td.findByAssignee(3);

        System.out.println("The assignees tasks before removal of an object are    ");
        if (any != null)
            for (int i = 0; i < any.length; i++) //Todo-> Person-> fields
            {
                System.out.print(any[i].getTodoid()+" ");
                System.out.print((any[i].getAssignee().getFirstName()) + "              ");
                System.out.print((any[i].getAssignee().getLastName()) + "                             ");
                System.out.println((any[i].getDescription()));
            }
        System.out.println("\n");
        System.out.println("The assignees tasks after removal of an object are    ");
       // System.out.println(td.size());
        boolean removeTDitem = td.remove(4);
        if(removeTDitem)
            System.out.println("The person is successfully removed ");
        System.out.println("\n");
        //System.out.println("Size of People array AFTER is "+p.size());
       // System.out.println(td.size());
        System.out.println("Addng more TodoItems to the array");
        td.addTodo("Sluta", "TodoIT", "på helgen", true);
        td.addTodo("Boka", "Billjet", "Perth", false);
        td.addTodo("Deliver", "Schedule", "Nästa vecka", true);


        Todo[] any1 = td.findByAssignee(3);

        System.out.println("The assignees tasks are    ");
        if (any1 != null)
            for (int i = 0; i < any1.length; i++) //Todo-> Person-> fields
            {
                System.out.print(any1[i].getTodoid()+" ");
                System.out.print((any1[i].getAssignee().getFirstName()) + "              ");
                System.out.print((any1[i].getAssignee().getLastName()) + "                             ");
                System.out.println((any1[i].getDescription()));
            }
        System.out.println("The size of TodoItems array now becomes "+td.size());

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Things to do                   Ref. Todo ");

        //Printing first line of Todo(Things to do)
        Todo thingTodo1 = new Todo(TodoSequencer.nextTodoId(), "First  task done", true, person1);
        Todo thingTodo2 = new Todo(TodoSequencer.nextTodoId(), "Second task done", false, person2);
        Todo thingTodo3 = new Todo(TodoSequencer.nextTodoId(), "Third task done", true, person3);
        Todo thingTodo4 = new Todo(TodoSequencer.nextTodoId(), "Fourth task done", false, person4);

        System.out.print(thingTodo1.getAssignee().getPersonId() + " ");
        System.out.print(thingTodo1.getAssignee().getFirstName() + " ");
        System.out.print(thingTodo1.getAssignee().getLastName() + " ");   //2 Muhammad Salah-Ud-Din

        System.out.print(" (" + thingTodo1.getTodoid() + ") ");
        System.out.print(thingTodo1.getDescription() + " ");
        System.out.print(thingTodo1.getDone() + " ");                //1 First thing done true

        System.out.print("(" + thingTodo2.getTodoid() + ") ");
        System.out.print(thingTodo2.getDescription() + " ");
        System.out.print(thingTodo2.getDone() + "\n");              //2 Second thing done true


        //Printing second line of Todo(Things to do)

        System.out.print(thingTodo2.getAssignee().getPersonId() + " ");
        System.out.print(thingTodo2.getAssignee().getFirstName() + " ");
        System.out.print(thingTodo2.getAssignee().getLastName() + " ");   //2 Muhammad Salah-Ud-Din

        System.out.print(" (" + thingTodo2.getTodoid() + ") ");
        System.out.print(thingTodo2.getDescription() + " ");
        System.out.print(thingTodo2.getDone() + " ");                //1 First thing done true

        System.out.print("(" + thingTodo1.getTodoid() + ") ");
        System.out.print(thingTodo1.getDescription() + " ");
        System.out.print(thingTodo1.getDone() + "\n");              //2 Second thing done true

        //Printing THIRD line of Todo(Things to do)
        System.out.print(thingTodo3.getAssignee().getPersonId() + " ");
        System.out.print(thingTodo3.getAssignee().getFirstName() + " ");
        System.out.print(thingTodo3.getAssignee().getLastName() + " ");   //2 Muhammad Salah-Ud-Din

        System.out.print(" (" + thingTodo3.getTodoid() + ") ");
        System.out.print(thingTodo3.getDescription() + " ");
        System.out.print(thingTodo3.getDone() + " ");                //1 First thing done true

        System.out.print("(" + thingTodo1.getTodoid() + ") ");
        System.out.print(thingTodo1.getDescription() + " ");
        System.out.print(thingTodo1.getDone() + "\n");              //2 Second thing done true

        //Printing FOURT line of Todo(Things to do)

        System.out.print(thingTodo4.getAssignee().getPersonId() + " ");
        System.out.print(thingTodo4.getAssignee().getFirstName() + " ");
        System.out.print(thingTodo4.getAssignee().getLastName() + " ");   //2 Muhammad Salah-Ud-Din

        System.out.print(" (" + thingTodo3.getTodoid() + ") ");
        System.out.print(thingTodo3.getDescription() + " ");
        System.out.print(thingTodo3.getDone() + " ");                //1 First thing done true

        System.out.print("(" + thingTodo4.getTodoid() + ") ");
        System.out.print(thingTodo4.getDescription() + " ");
        System.out.print(thingTodo4.getDone() + "\n");              //2 Second thing done trueSystem.out.println("\n");
        System.out.println("\n");


    }
}

