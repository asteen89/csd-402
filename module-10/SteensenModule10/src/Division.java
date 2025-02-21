// Alisa Steensen
// M10

// This program demonstrates inheritance and abstraction using a company's Division. The Division class is the base abstract class and two subclasses DomesticDivision and InternationalDivision extend it. The UseDivision class contains the main method where the instances of these subclasses are created and displayed.

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
