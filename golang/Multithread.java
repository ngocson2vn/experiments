// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread { 
	private String threadName;
	public MultithreadingDemo(String threadName) {
		this.threadName = threadName;
	}

	public void run() { 
		try {
			System.out.println(threadName);
			Thread.sleep(2 * 60 * 1000);
		} catch (Exception e) { 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class Multithread { 
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++) {
			MultithreadingDemo t = new MultithreadingDemo(String.format("Thread #%d", i));
			t.start(); 
		} 
	} 
} 

