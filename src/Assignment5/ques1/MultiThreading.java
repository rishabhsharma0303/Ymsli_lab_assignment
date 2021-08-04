package Assignment5.ques1;
class Myjob implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
				Thread.sleep(100); // for concurrent execution of all the threads
			}
		} catch (Exception e) {
			System.out.println("Interruption occured in " + Thread.currentThread().getName());
		}
		System.out.println("Thread Terminated:" + Thread.currentThread().getName());
	
}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myjob myjob=new Myjob();
		Thread t1=new Thread(myjob,"Thread One");
		Thread t2=new Thread(myjob,"Thread two");
		Thread t3=new Thread(myjob,"Thread three");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
