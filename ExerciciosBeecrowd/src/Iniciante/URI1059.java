import java.util.Scanner;

public class URI1059 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			for (int i=1; i <=100; i++ ) {
				if (i % 2 == 0) {
					System.out.printf("%d\n", i);
				}
			}
			
			
			input.close();
		}
}
