
class ThreadAA implements Runnable {

	@Override
	public void run() {
		System.out.println("Class A run method");

	}

}

public class TestThread {
	public static void main(String args) {
		Thread thread= new Thread(new ThreadA());
		System.out.println("Before calling start method : "+thread.getState());
		thread.start();
		System.out.println("After calling start method : "+thread.getState());
	}
}
