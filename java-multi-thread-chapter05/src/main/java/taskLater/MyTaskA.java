package taskLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("A begin timer = " + new Date());
			Thread.sleep(20000);
			System.out.println("A   end timer = " + new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
