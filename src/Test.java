/**
 * @author Drumstyle92
 * class that maintains the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * main method where we find a string, a string method and its output.
     */
    public static void main(String[] args) {
        //
        String myString = "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println("-------------------------------------------------------------------");
        System.out.println(myString.replaceAll(" are","_XYZ"));
    }
}
