package Ex3;

public class Fork {
	// Trang thai cua fork 
	private boolean[] use = { false, false, false, false, false }; 
	
	public synchronized void getFork() {
		String name = Thread.currentThread().getName();
		int i = Integer.parseInt(name);
		while (use[i] == true || use[(i+1)%5] == true) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			
		}
		use[i] = true;
		use[(i+1)%5] = true;
	}

	public synchronized void putFork() {
		String name = Thread.currentThread().getName();
		int i = Integer.parseInt(name);

		use[i] = false;
		use[(i + 1) % 5] = false;
		notifyAll();
	}
}
