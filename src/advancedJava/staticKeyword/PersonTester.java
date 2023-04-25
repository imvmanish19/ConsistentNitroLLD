package advancedJava.staticKeyword;

public class PersonTester {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.printStaticData();
        Person p = new Person("Manish", 22);
        Person.printStaticData();
    }
}
