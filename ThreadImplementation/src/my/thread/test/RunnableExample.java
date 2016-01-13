package my.thread.test;

public class RunnableExample {
	public static void main(String[] args){
		Thread thread1 = new Thread(new RunnableThread());
		Thread thread2 = new Thread(new RunnableThread());
				
		thread1.start();
		thread2.start();
			
				//Display info about the main thread
				System.out.println(Thread.currentThread());
	}

}
