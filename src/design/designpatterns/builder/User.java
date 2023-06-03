package design.designpatterns.builder;

public class User {
    private final int id;
    private final String name;
    private final String phoneNumber; // optional
    private final int age; //optional

    private User(Builder builder) {
        /** check all fields **/
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
       private int id;
       private String name;
       private String phoneNumber;
       private int age;

       public Builder(int id, String name) {
           this.id = id;
           this.name = name;
           this.age = 0;
           this.phoneNumber = "";
       }

       public Builder phoneNumber(String phoneNumber) {
           this.phoneNumber = phoneNumber;
           return this;
       }

       public Builder age(int age) {
           this.age = age;
           return this;
       }

       public User build() {
           return new User(this);
       }
   }
}
