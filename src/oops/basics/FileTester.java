package oops.basics;

public class FileTester {
    public static void main(String[] args) {
        File file = new File("/tmp/manish/abc.txt");
        file.addContent("ABCDEDF");
        file.addContent("123");
        System.out.println(file);
    }
}
