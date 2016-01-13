package my.thread.test;

public class SignupProcessThread implements Runnable {

	@Override
	public void run() {
		ThreadTest.getRegistryRequest("Shital");
		
	}

	public void start() {
		run();
		
	}
	

}
