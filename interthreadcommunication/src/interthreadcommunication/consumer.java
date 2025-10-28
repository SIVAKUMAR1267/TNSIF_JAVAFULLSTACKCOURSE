//Program to demonstrate InterThread Communication - Consumer Thread Class
package interthreadcommunication;

public class consumer extends Thread {
	Q obj; 

	public consumer(Q obj) {
		this.obj = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}
