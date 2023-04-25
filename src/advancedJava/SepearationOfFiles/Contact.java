package advancedJava.SepearationOfFiles;

public class Contact {
    private String mobileNo;

    public Contact(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
