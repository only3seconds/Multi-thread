package lockMethodTest3_test1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Service service1 = new Service(true);
		Runnable runnable = new Runnable() {
			public void run() {
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		final Service service2 = new Service(false);
		runnable = new Runnable() {
			public void run() {
				service2.serviceMethod();
			}
		};
		thread = new Thread(runnable);
		thread.start();
	}

}
