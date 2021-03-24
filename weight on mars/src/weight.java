
import java.util.Scanner;

public class weight {
	
	static void println(String string) {
        System.out.println(string);
    }

    static void print(String string) {
        System.out.print(string);
    }

    /**
     * calculate your weight on mars
     * then display weight on both planet
     */
    private static void calculateweightonmars() {
        Scanner scanner = new Scanner(System.in);
        println("Enter your weight in Kilogram : ");
        double weight = scanner.nextFloat();
        double earthgravity = 9.81;
        double marsgravity = 3.711;

        double marsweight = (weight/earthgravity) * marsgravity;

        //print the result
        String result = "";

        println("Your weight on earth is: " +weight+ " KG ");
        println("Your weight on mars is: " +marsweight+ " KG ");

    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);

	        //weight and variables
	        double weight;
	        double earthgravity = 9.81;
	        double marsgravity = 3.711;

	        println("Calculate your weight on mars base on ur weight on earth");

	            println("");
	            println("please enter your weight");
	            calculateweightonmars();
	            
	            
	        
	    }
	}
