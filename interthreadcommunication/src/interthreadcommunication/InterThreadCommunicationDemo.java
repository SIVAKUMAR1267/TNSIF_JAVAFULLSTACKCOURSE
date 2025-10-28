//Program to demonstrate inter-thread communication
package interthreadcommunication;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//Shared Resource
		Q obj=new Q();
		
		Producer p1=new Producer(obj); //Producer thread
		consumer c1=new consumer(obj); //Consumer thread
					
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}






