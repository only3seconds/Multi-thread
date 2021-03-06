package pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedWriter outputStream = new PipedWriter();
			PipedReader inputStream = new PipedReader();
			
			//inputStream.connect(outputStream);
			outputStream.connect(inputStream);
			
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
