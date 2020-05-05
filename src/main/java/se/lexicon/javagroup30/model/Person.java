package se.lexicon.javagroup30.model;

public class Person {
  //  private int personId=0;
    final int personId;                                  // final was made but with initiallization???
    String firstName;
    String lastName;

    // Constructor
                                                           //  Problem is that it is not letting define constructor
                                                              //   Eric says ONLY Getter is needed for ID
                                                              // Have to check the lecture of Pet when he creates ID
                                                              // and create constructors etc. likewise

    public Person(int personId)
    {
        this.personId= personId;
    }
   public Person(int personId, String firstName, String lastName)
   {
       this.personId = personId;
       this.firstName = firstName;
       this.lastName = lastName;
   }

   // public Person() {    }

    // public Person() {   }                  // Bycreating this constructor, we can use both constructors Person(), Person(firstName, lastName) in App and testing



//Getters and Setters

                                              // No setter for personId since it is index
    public int getPersonId() {
        return personId;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

}
