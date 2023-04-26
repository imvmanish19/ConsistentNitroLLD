package constructors;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private char section;
    private String classNumber;

    public Person() {

    }

    public Person(String name, int age, char section, String classNumber) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.classNumber = classNumber;
    }

    public Person(Person person) {
        this.age = person.age;
        this.name = person.name;
        this.section = person.section;
        this.classNumber = person.classNumber;
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

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", section=" + section +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && section == person.section && Objects.equals(name, person.name) && Objects.equals(classNumber, person.classNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, section, classNumber);
    }
}
