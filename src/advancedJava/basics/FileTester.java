package advancedJava.basics;

public class FileTester {
    public static void main(String[] args) {
        File file = new File("/tmp/manish/abc.txt");
        File f1 = new File("/tmp/manish/abc.txt");
        File f2 = new File("/tmp/manish/abc.txt");
        f2.addContent("ABCDEDF");
        f2.addContent("123");
        System.out.println(File.count);
    }
}
