package design.designpatterns.builder;

public class UserTester {
    public static void main(String[] args) {
        /** Chaining **/
        User user = new User.Builder(1, "Sachin").phoneNumber("83939").age(22).build();
        System.out.println(user);
    }
}
