package my.thread.test;

public class ThreadExample {
	public static void main(String[] args){
		ThreadImpl threadObj = new ThreadImpl();
		ThreadImpl threadObj1 = new ThreadImpl();
		threadObj.start();
		threadObj1.start();
		
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}
