// Alisa Steensen
// M10

public class UseDivision {
    public static void main(String[] args) {
        
        // Instances of International Division
        InternationalDivision division1 = new InternationalDivision("Sales", 12345, "Mexico", "Spanish");
        InternationalDivision division2 = new InternationalDivision("Marketing", 54321, "Asia", "Mandarin");

        // Instances of Domestic Division
        DomesticDivision domDivision1 = new DomesticDivision("Human Resources", 23456, "Indiana");
        DomesticDivision domDivision2 = new DomesticDivision("Engineering", 456577, "Alabama");

        // Print details
        division1.display();
        division2.display();
        domDivision1.display();
        domDivision2.display();
    }
}

