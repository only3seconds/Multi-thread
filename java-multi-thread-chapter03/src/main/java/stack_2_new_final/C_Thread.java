package stack_2_new_final;

public class C_Thread extends Thread {
	
	private C r;
	
	public C_Thread(C r) {
		super();
		this.r = r;
	}
	
	public void run() {
		while (true) {
			r.popService();
		}
		
	}

}
