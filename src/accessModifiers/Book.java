package accessModifiers;

public class Book {
    String subject;
    public int noOfPages;
    protected double cost;
    private boolean isRuled;

    public Book(String subject, int noOfPages, double cost, boolean isRuled) {
        this.subject = subject;
        this.noOfPages = noOfPages;
        this.cost = cost;
        this.isRuled = isRuled;
    }

    /** private method and variable can be accessed only inside the class **/
    private void printBookRule() {
        System.out.println("IsRuled: "+isRuled);
    }

    public void accessPrintBookRuleMethod() {
        printBookRule();
    }

    /** public method and variable can be accessed everywhere **/
    public void alternativeWayToPrintPages() {
        System.out.println("NoOfPages: "+noOfPages);
    }

    /** protected method and variable can be accessed inside the package and by the child classes **/
    protected void printCost() {
        System.out.println("Cost: "+cost);
    }

    /** default method and variable can be accessed only inside this package, child cannot access it using do operator **/
    void getSubject() {
        System.out.println("Subject: "+subject);
    }
}
