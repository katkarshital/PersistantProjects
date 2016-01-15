package my.email.server;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileServer implements Runnable{
	private FileOutputStream out;
	private String[] queue;

	public FileServer() {
	}

	public FileServer(FileOutputStream out, String[] queue) {
		this.out = out;
		this.queue = queue;
	}

	@Override
	public void run() {
		
		synchronized (queue) {
			int i = 0;
			while (queue.length>i) {
				try {
						out.write("\n".getBytes("UTF-8"));
						switch(i){
						case 0:
							out.write("To : ".getBytes("UTF-8"));
							break;
						case 1:
							out.write("From : ".getBytes("UTF-8"));
							break;
						case 2:
							out.write("Subject : ".getBytes("UTF-8"));
							break;
						case 3:
							out.write("Body : ".getBytes("UTF-8"));
							break;
						}
						out.write(queue[i].getBytes("UTF-8"));
					} catch (IOException e) {
						e.printStackTrace();
					}
				i++;
			}
		}

	}
	
}
