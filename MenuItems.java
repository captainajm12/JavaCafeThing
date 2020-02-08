package testbed1_3;

import java.util.HashMap;
import java.util.Map;

public interface MenuItems {

	Map <Integer, String> menuItems = new HashMap<Integer, String>();
	Map <Integer, String> adminChoice =  new HashMap<Integer, String>();
	
	public void getMenu();
	public void setMenu();
	public int getScone();
	public void setScone();
	public int getCinnamonRoll();
	public void setCinnamonRoll();
	public void setCoffee();
	public int getCoffee();
	public void displayOrder();
	public void setAdminWish();
	public boolean getAdminWish();
	

}
