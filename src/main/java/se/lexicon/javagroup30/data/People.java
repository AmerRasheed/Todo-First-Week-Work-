package se.lexicon.javagroup30.data;

import se.lexicon.javagroup30.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] persons = new Person[0];
//Person[] perarr = new Person();
    //Person perarr = new Person(1,"a","b");
//    People personarrvar = new Person[];


    public int size() {
        return persons.length;
    }

    public Person[] findAll() {
        return persons;
    }

    public Person findById(int personId) {

        Person[] newarray = new Person[0];
        Person send = null;
        for (Person name : persons) {

            if (name.getPersonId() == personId)
                send = name;
        }
        return send;
    }

    public Person addPerson(String personName, String lastName) {
        Person person = new Person(PersonSequencer.nextPersonId(), personName, lastName);
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length - 1] = person;
        return person;
    }

    public void clear() {
        persons = new Person[0];
    }


    public boolean remove(int personId) {

        // boolean isremoved=false;
        //6 Rana //Kanske 3 också
        //4 Mustansar
        //5 Hamid

        Boolean flag = false;
        int persize = persons.length;
        Person[] toremovearr = new Person[0];
        Person[] before = new Person[persize];
        Person[] after = new Person[persize];
        Person[] after1 = Arrays.copyOf(after, after.length + 1);
        Person[] combined = new Person[persize - 1];
        int index = 0;
        int beforeind = 0;
        int afterind = 0;
        int combindex = 0;
        for (int i = 0; i < persons.length; i++) {      // Loop to find person (to be removed) index
            if (persons[i] == null)

                System.out.println("No element found in the People array");
            else if (persons[i].getPersonId() == personId)
                index = i;
        }

        for (int i = 0; i < persons.length; i++) {     // Before and after are two arrays used to remove the person
            if (i < index) {                           //Combined is the final array
                before[i] = persons[i];
                beforeind++;
                combindex++;
            } else {
                if (i == 2) {
                    after1[i] = persons[i];

                } else
                    after1[i] = persons[i + 1];

                //System.out.println(after1[i].getFirstName());
                // System.out.println(persons[i].getFirstName());
                afterind++;
                combindex++;
            }
        }
        //Person[] combined1 = Arrays.copyOf(combined,combined.length+1);
        for (int i = 0; i < combindex - 1; i++) {
            if (i < beforeind)
                combined[i] = before[i];
            else {
                combined[i] = after1[i];
                flag = true;
            }
        }

        //for(int i=0;i<any.length;i++) //Todo-> Person-> fields
        //  System.out.println((any[i].getAssignee().getFirstName()));
        System.out.println("Persons left in the persons array after removing a person");
        for (int i = 0; i < persize - 1; i++) {
            System.out.print(combined[i].getPersonId() + " ");
            System.out.println(combined[i].getFirstName());
        }
        return flag;
    }
}


