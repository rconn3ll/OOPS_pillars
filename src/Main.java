public class Main {
    public static void main(String[] args) {

        //Abstraction:
        //The earth and saturn objects extend the abstract planet class.
        //Much of the code for each planet is handled entirely by the abstract class.
        //This way implementation details are hidden and only functionality is exposed.

        //create earth object
        Planet earth = new Earth();
        //create saturn object
        Planet saturn = new Saturn();

        //Inheritance:
        //Each planet object inherits the methods of the abstract Planet class
        //In this case the printInfo() method is only written in the abstract Planet class

        earth.printInfo();
        saturn.printInfo();

        //Encapsulation:
        //The following code would fail because the object's variables are private
        //saturn.moons=1;
        //The variables can be set with the setters, but not controlled directly.

        //newline
        System.out.println();
        //change saturn's moon property with the setter
        saturn.setMoons(1);
        saturn.printInfo();

        //Polymorphism:
        //The planetMessage method in the Planet class is overwritten in the saturn class
        //this is an example of a function that behaves differently based on implementation

        //newline
        System.out.println();
        earth.planetMessage();
        saturn.planetMessage();
    }
}