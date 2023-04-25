package advancedJava.SepearationOfFiles;

public class Bank {
    private int bankBalance;
    private int accNumber;

    public Bank(int bankBalance, int accNumber) {
        this.bankBalance = bankBalance;
        this.accNumber = accNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankBalance=" + bankBalance +
                ", accNumber=" + accNumber +
                '}';
    }
}
