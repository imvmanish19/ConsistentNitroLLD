package advancedJava.SepearationOfFiles;

public class Person {
    private String name;
    private int age;
    private Bank bank;
    private Contact contact;

    public Person(String name, int age, Bank bank, Contact contact) {
        this.name = name;
        this.age = age;
        this.bank = bank;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bank=" + bank +
                ", contact=" + contact +
                '}';
    }
}
