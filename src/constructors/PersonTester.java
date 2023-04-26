package constructors;

public class PersonTester {
    public static void main(String[] args) {
        // Compiler won't give us the default constructor, as we have a constructor explicitly declared by us
        // Person person = new Person();
        // Create an empty constructor in Person call for this to work.
        Person person = new Person();
        System.out.println(person);
        // Constructor Overloading in action
        Person person1 = new Person("Manish", 22, 'A', "Final Year Engineering, BE");
        System.out.println(person1);
        // Copy Constructor
        Person copyPerson = new Person(person1);
        System.out.println(copyPerson);
    }
}
