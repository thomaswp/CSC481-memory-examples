
public class Main {

	public static void main(String[] args) {
		System.out.println("!");
		for (int i = 0; i < 200000; i++) {
			int[] a = new int[100000];
		}
		System.gc();
	}
}
