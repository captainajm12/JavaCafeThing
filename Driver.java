package testbed1_3;

public class Driver { 
	
	
	static boolean running = true;
	
	public static void main(String[] args) {
		
		LandingMenu land1 = new LandingMenu();
		MenuScreen menu = new MenuScreen();
		
		while (running) {
			menu.getMenu();
			if (ScannerInput.getSelection() == 1) {
				menu.setCoffee();
			}
			else if (ScannerInput.getSelection() == 2) { 
				menu.setScone();
			}
			else if (ScannerInput.getSelection() == 3) {
				menu.setCinnamonRoll();
			}
			else if (ScannerInput.getSelection() == 100) {
				System.out.println("Welcome Admin! What would you like to do?");
				System.out.println(menu.adminChoice);
				ScannerInput.setSelection();
				menu.setAdminWish();
			}
			running = menu.getAdminWish();
			if(running == false) {
				break;
			}
			else {
				menu.displayOrder();
			}
		}
		
		System.out.println("Thank you and please come again!");
		
	}

}
