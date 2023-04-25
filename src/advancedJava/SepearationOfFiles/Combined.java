package advancedJava.SepearationOfFiles;

public class Combined {
    private String name;
    private int age;
    private int bankBalance;
    private String mobileNo;
    private int accNumber;

    public Combined() {

    }

    public Combined(String name, int age, int bankBalance, String mobileNo, int accNumber) {
        this.name = name;
        this.age = age;
        this.bankBalance = bankBalance;
        this.mobileNo = mobileNo;
        this.accNumber = accNumber;
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

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Combined{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bankBalance=" + bankBalance +
                ", mobileNo='" + mobileNo + '\'' +
                ", accNumber=" + accNumber +
                '}';
    }
}
