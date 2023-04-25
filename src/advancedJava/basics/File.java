package advancedJava.basics;

import java.time.LocalDateTime;

public class File {
    private String absolutePath;
    private String contents;
    private LocalDateTime dateOfCreation;
    private int size;
    public static int count;

    public File(String absolutePath) {
        this.absolutePath = absolutePath;
        this.dateOfCreation = LocalDateTime.now();
        this.contents = "";
        count++;
    }

    public void addContent(String content) {
        this.contents += content;
        this.size = this.contents.length();
    }

    public void copy(String path) {
        // Dummy Logic
        System.out.println("Copied");
    }

    public String delete() {
        this.size = 0;
        this.contents = "";
        return this.absolutePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "absolutePath='" + absolutePath + '\'' +
                ", contents='" + contents + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", size=" + size +
                '}';
    }
}
