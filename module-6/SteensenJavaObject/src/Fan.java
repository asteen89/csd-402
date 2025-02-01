// Alisa Steensen
// Module M6

// This program creates a class called Fan that shows both a no-argument constructor (sets default values) and an argument constructor (values set directly). It also has a toString method that prints out the values of the fans current state. The program first prints out the default values, then changes the fan's settings using setters and getters, and then prints out the new values.

public class Fan {
    // Setting the constants for the fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 2;
    public static final int MEDIUM = 3;
    public static final int FAST = 4;

    private int speed = STOPPED; // Default speed is stopped

    private static final boolean ON = true; // Specifies whether the fan is on or off
    private static final boolean OFF = false;

    private boolean on; // Specifies whether the fan is on or off

    private double radius = 6; // Default value for the radius

    String color = "white"; // Default color

    // Setter
    public void setSpeed(int setSpeed) { 
        this.speed = setSpeed;
    }
    // Getter
    public int getSpeed() {
        return speed;
    }

    // Setter for boolean on or off
    public void setPower(boolean on) {
        this.on = true;
    }
    // Getter for boolean on or off
    public boolean getPower() {
        return on;
    }

    // Setter for radius
    public void setRadius(double setRadius) {
        this.radius = setRadius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for color
    public void setColor(String setColor) {
        this.color = setColor;
    }

    //Getter for color
    public String getColor() {
        return color;   
    }
    // No argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = OFF;
        this.radius = 6;
        this.color = "white";
    }
    // Argument Constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    // toString method
    public String toString() {
        return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Power: " + (on ? "On" : "Off");
    }

    public static void main(String[] args) { 
        // fan1 object
        Fan fan1 = new Fan();

        // Show the default values first
        System.out.println("Default values for fan1: ");
        System.out.println(fan1.toString());
        System.out.println();

        fan1.setSpeed(FAST);
        fan1.setPower(ON);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.toString();

        //Print the .toString method
        System.out.println("Values for fan1 after new settings: ");
        System.out.println(fan1.toString());
        System.out.println();

        Fan fan2 = new Fan();
        //fan2 object
        fan2.setSpeed(MEDIUM);
        fan2.setPower(OFF);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.toString();

        //Print the .toString method
        System.out.println("Values for fan2 after new settings: ");
        System.out.println(fan2.toString());
        System.out.println();
    }
        
    
    
}