// Alisa Steensen
// M10

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

        // Display method
            @Override
            public void display() {
            System.out.println("Domestic Division: " + divisionName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("State: " + state);
        }
    }
    

