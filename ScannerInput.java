package testbed1_3;

import java.util.Scanner;

public class ScannerInput {
	
	private static String name;
	private static int selection;
	private static String conf; 
	public static Scanner scan = new Scanner(System.in);
	
	public static void setName() {
		name = scan.next();
	}
	
	public static void setSelection() {
		selection = scan.nextInt();
	}
	
	public static int getSelection() {
		return selection;
	}
	
	public static void setConfirmation() {
		conf = scan.next();
	}
	public static String getConfirmation() {
		return conf;
	}
	
	public static String getName() {
		return name;
	}
	
}
