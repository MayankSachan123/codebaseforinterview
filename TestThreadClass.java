
public class TestThreadClass implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread : "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId());
		
		/*
		 * Thread th = new Thread(new TestThreadClass()); th.start();
		 */
		
		Thread thread= new Thread(new ThreadA());
		thread.start();
		System.out.println("After calling run method : "+thread.getState());
		
		
		Thread threadB= new Thread(new ThreadB());
		threadB.start();
		//System.out.println("After calling run method : "+threadB.getState());
		
		threadB.join();
	}

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId());
	}

}

class ThreadA implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId());
		
		try {
			Thread.sleep(1500);
			System.out.println("Thread : "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}

class ThreadB extends Thread {

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId());

	}
}