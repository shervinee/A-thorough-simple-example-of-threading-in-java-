package tehran;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(){
			public void run(){
				System.out.println(1);
				System.out.println(2);
			}
		};
		Thread thread1 = new Thread(){
			public void run(){
				System.out.println(3);
				System.out.println(123);
			}
		};
		Thread thread2 = new Thread(){
			public void run(){
				System.out.println(3);
				System.out.println(4);;
			}
		};
		thread.start();
		thread1.start();
		thread1.start();
	}
	Target target = new Target();
}
