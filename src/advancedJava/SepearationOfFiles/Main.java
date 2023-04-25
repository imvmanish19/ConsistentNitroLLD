package advancedJava.SepearationOfFiles;

public class Main {
    public static void main(String[] args) {
        /** Lot of information and logic is packed in a single class, we can make this better **/
        Combined combined = new Combined("Rahul", 23, 1000, "9090903030", 1001);
        System.out.println(combined);

        /**
         * Better design, we have seperated similar (DATA+ALGORITHMS) into different files with the help of classes
         */
        Bank bank = new Bank(1000, 101);
        Contact contact = new Contact("9090807954");
        Person person = new Person("Srishti", 22, bank, contact);
        System.out.println(person);
    }
}
