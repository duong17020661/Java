package Ex3;

public class Main {

	public static void main(String[] args) {
		Fork fork = new Fork();
		
		Philosopher p0 = new Philosopher("0", fork);
		Philosopher p1 = new Philosopher("1", fork);
		Philosopher p2 = new Philosopher("2", fork);
		Philosopher p3 = new Philosopher("3", fork);
		Philosopher p4 = new Philosopher("4", fork);
		p0.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();

	}

}
