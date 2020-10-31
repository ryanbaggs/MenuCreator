package menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.0
 * 
 * @author Ryan Baggs
 * Created on @date 07-Oct-2020
 *
 * Sets up a menu of specified options and requests input of options. First 
 * initialize the menuOptions Array. Second setup the cases for the options. 
 * Third call the displayMenu() method.
 */
public class MenuCreator {
	
	private boolean running = true;
	private Scanner scanner = new Scanner(System.in);
	private String[] menuOptions;
	
	/**
	 * Displays the Menu and gets the user input passing that to the 
	 * selection cases.
	 */
	protected void displayMenu() {
		while(running) {
			
			// Initialize the option for user selection.
			int option = 0;
			
			// Print out basic request.
			System.out.println("Please select an option:");
			// Print output specified.
			printOptions(menuOptions);
			
			// Get the user selection.
			option = scanner.nextInt();
			
			// Select from the cases provided.
			selectionCases(option);
		}
	}
	
	/**
	 * Enter the options that you would like to print out, prints out the 
	 * specified Strings to the console.
	 * 
	 * @param menuOptions To be displayed to the console.
	 */
	protected void printOptions(String[] menuOptions) {
		for(String option : menuOptions) {
			System.out.println(option);
		}
	}
	
	/**
	 * Override to create selection of cases. Use switch statement and 
	 * include the provided exit() method.
	 * 
	 * @param option The user selected option that was input.
	 */
	protected void selectionCases(int option) {
		
	}
	
	/**
	 * Exits the Menu and closes the Scanner.
	 */
	protected void exit() {
		running = false;
		
		// Close the input Scanner.
		try {
			scanner.close();
		} catch(IllegalStateException ise) {
			System.err.println("Illegal State Exception occured when trying" 
					+ "to close input Scanner");
			ise.printStackTrace();
		}
	}
	
	/**
	 * Exits the Menu and closes the Scanner with optional message.
	 * 
	 * @param exitMessage Optional message to print to the console while 
	 * exiting.
	 */
	protected void exit(String exitMessage) {
		if(exitMessage != null) {
			System.out.println(exitMessage);
		}
		
		running = false;
		
		// Close the input Scanner.
		try {
			scanner.close();
		} catch(IllegalStateException ise) {
			System.err.println("Illegal State Exception occured when trying" 
					+ "to close input Scanner");
			ise.printStackTrace();
		}
	}
	
	/**
	 * Use to print an ArrayList of Strings as output to the 
	 * console. Each string is separated by a new line.
	 * 
	 * @param output to be printed to the console. 
	 */
	public void printOutput(ArrayList<String> output) {
		for(String string : output) {
			System.out.println(string);
		}
	}
	
	public void setMenuOptions(String[] menuOptions) {
		this.menuOptions = menuOptions;
	}

	public String getScannerString() {
		return scanner.nextLine();
	}
	
	public int getScannerInt() {
		return scanner.nextInt();
	}
}
