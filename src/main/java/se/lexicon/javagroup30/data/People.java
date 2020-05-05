package se.lexicon.javagroup30.data;

import se.lexicon.javagroup30.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] persons = new Person[0];

public boolean personExists(Person personName){
    boolean exists=false;

    for(Person aperson : persons){
        if(persons.equals(personName)) {
            exists = true;
            break;
        }
    }

    return exists;
}

public Person addPerson(String personName, String lastName){
    Person person = new Person(PersonSequencer.nextPersonId(),personName, lastName);
    persons[persons.length-1]=person;
    return person;

/*
    if(personName==null)
        return false;
    if(personExists(personName))
        return false;
    persons= Arrays.copyOf(persons,persons.length+1);
    persons[persons.length-1] = personName;
    return true;
    */

}


public static void display(){
    //if (personExists()==true)
    for(int i=0;i<persons.length;i++)
        System.out.println(persons[i]);
    }

public Person[] finaAll(){
    return persons;
}
   // return persons;

public int size(){

    return persons.length;
    /*int arraysize=0;
    System.out.println(arraysize=persons.length);

    return arraysize;
*/
}
    public void clear(){
persons = new Person[0];
    }


}



//public int size(){}


