package testbed1_3;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
	
	public static Queue<String> cQueue = new LinkedList<>();
	
	public static void setQueue() {
		cQueue.add(ScannerInput.getName());
	}
	
	public static void getQueue() {
		System.out.println(cQueue);
	}

}
