package testbed1_3;

public class MenuScreen implements MenuItems{
	
	private int coffeeSizeS = 0;
	private int coffeeSizeM = 0;
	private int coffeeSizeL = 0;
	private int sconeCount = 0;
	private int cinnamonRollCount = 0;
	private double total = 0.0;
	private boolean adminWish= true;
	
	@Override
	public void getMenu() {
		menuItems.put(1, "Coffee - $1.05-S, $2.05-M, $3.05-L");
		menuItems.put(2, "Scone - $1.00");
		menuItems.put(3, "Cinnamon Roll - $1.75");
		
		System.out.println("--Menu--");
		System.out.println(menuItems);
		setMenu();
	}
	
	@Override
	public void setCoffee() {
		
			System.out.println("What size would you like? 1 = S, 2 = M, 3 = L?");
			ScannerInput.setSelection();
			
			if (ScannerInput.getSelection() == 1) {
				coffeeSizeS += 1;
				total += 1.05;
			}
			else if(ScannerInput.getSelection() == 2) {
				coffeeSizeM += 1;
				total += 2.05;
			}
			else if (ScannerInput.getSelection() == 3) {
				coffeeSizeL += 1;
				total += 3.05;
			}
	}
	
	@Override
	public void displayOrder() {
		
		System.out.println("Your order: ");
		System.out.print("Current Queue: ");
		CustomerQueue.getQueue();
		
		if (coffeeSizeS > 0) {
			int tmpInt1 = getCoffee();
			System.out.println(tmpInt1 + " Small Coffee'(s)");
		}
		if (coffeeSizeM > 0) {
			int tmpInt2 = getCoffee();
			System.out.println(tmpInt2 + " Medium Coffee'(s)");
		}
		if (coffeeSizeL > 0) {
			int tmpInt3 = getCoffee();
			System.out.println(tmpInt3 + " Large Coffee'(s)");
		}
		
		if (sconeCount > 0) {
			System.out.println(getScone());
		}
		
		if(cinnamonRollCount > 0) {
			System.out.println(getCinnamonRoll());
		}
		
		String tot = String.format("%.2f", total);
		System.out.println("Total: " + "$" + tot);
		System.out.println("Anything else? (y/n): ");
		ScannerInput.setConfirmation();
		
		if (ScannerInput.getConfirmation().equals("n")) {
			LandingMenu land = new LandingMenu();
		}
	}

	@Override
	public int getCoffee() {

			if (coffeeSizeS > 0) {
				//System.out.print("Small Coffee(s) - ");
				return coffeeSizeS;
			}
			
			if (coffeeSizeM > 0 ) {
				//System.out.print("Medium Coffee(s) - ");
				return coffeeSizeM;
			}
			
			if (coffeeSizeL > 0) {
				//System.out.print("Large Coffee(s) - ");
				return coffeeSizeL;
			}
			return 0;
		}

	@Override
	public int getScone() {
		System.out.print("Scone(s): ");
		return sconeCount;
		
	}

	@Override
	public void setScone() {
		total += 1.00;
		sconeCount += 1;
		
	}

	@Override
	public int getCinnamonRoll() {
		System.out.print("Cinnamon Roll(s): ");
		return cinnamonRollCount;	
	}

	@Override
	public void setCinnamonRoll() {
		total += 1.75;
		cinnamonRollCount += 1;
		
	}

	@Override
	public void setMenu() {
		ScannerInput.setSelection();
		
	}

	@Override
	public void setAdminWish() {
		adminChoice.put(1, "Shutdown");
		
		if (ScannerInput.getSelection() == 1) {
			adminWish = false;
		}
		else {
			adminWish = true;
		}
	}

	@Override
	public boolean getAdminWish() {
		return adminWish;
	}
}
