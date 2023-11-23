import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Abstract class
public abstract class Planet {
    //set up variables
    private String name;
    private int moons, orderFromSun, diameter;
    private BigInteger mass;

    //setter for name
    public void setName(String n) {
        this.name = n;
    }
    //setter for moons
    public void setMoons(int m) {
        this.moons = m;
    }
    //setter for order from sun
    public void setOrderFromSun(int o) {
        this.orderFromSun = o;
    }
    //setter for diameter
    public void setDiameter(int d) {
        this.diameter = d;
    }
    //setter for mass
    public void setMass(BigInteger m){
        this.mass = m;
    }

    //detect pluarl vs singular for moons
    public String moonNumber(int m) {
        if (m > 1) return m + " moons";
        else return m + " moon";
    }

    //convert orderFromSun value to its ordinal name.
    public String ordinalName(int ord) {
        String[] suffixes = new String[] {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        switch (ord % 100) {
            case 11:
            case 12:
            case 13:
                return ord + "th";
            default:
                return ord + suffixes[ord % 10];
        }
    }

    //print data
    public void printInfo() {
        //make variables more readable
        String ordinal = this.ordinalName(this.orderFromSun);
        //convert mass to scientific notation
        NumberFormat numFormat = new DecimalFormat("0.#####E0");
        String formatMass = numFormat.format(this.mass);
        //add commas to diameter
        String formatDiameter = String.format("%,d",this.diameter);
        //detect plural vs singular for moon(s)
        String moon = this.moonNumber(this.moons);

        //print data
        System.out.println("The planet "+this.name+" has "+moon+" and is the "+ordinal+" planet from the sun.");
        System.out.println("Its mass is "+formatMass+" kg and its diameter is "+formatDiameter+" km");
    }

    //Method used as an example of polymorphism
    public void planetMessage() {
        System.out.println("This default message means that the printMessage method was not overwritten");
    }
}

