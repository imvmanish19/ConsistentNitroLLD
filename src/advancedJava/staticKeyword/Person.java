package advancedJava.staticKeyword;

public class Person {
    private String name;
    private int age;
    public static int count;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static void printStaticData() {
        /** Non-static method 'getName()' cannot be referenced from a static context **/
        // System.out.println("Name "+name); name is also non-static therefore cannot be accessed
        // getName();
        System.out.println("Count "+count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
