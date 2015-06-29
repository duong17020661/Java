package Ex3;

public class Philosopher extends Thread {
	//private String name;
	private Fork fork;

	public Philosopher(String name, Fork fork) {
		super(name);
		this.fork = fork;
	}

	@Override
	public void run() {
		while(true) {
			Thinking();
			fork.getFork();
			eating();
			fork.putFork();
		}
	}

	public void eating() {
		System.out.println(Thread.currentThread().getName() + ": Eating.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void Thinking() {
		System.out.println(Thread.currentThread().getName() + ": Thinking.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
