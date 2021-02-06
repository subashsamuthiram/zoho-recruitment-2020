
public class ACD {
	public static void main(String args[]) {
		int input = 5;
		for (int i = input; i >= 1; i--) {
			for (int j = input; j > i; j--) {
				System.out.print(j);
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
