import java.util.Scanner;

public class URI1045 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			double A = input.nextDouble();
			double B = input.nextDouble();
			double C = input.nextDouble();
			
			double AA = Math.max(A, Math.max(B, C));
			double BB = 0;
			double CC = 0;
			
			if (AA == A) {
				BB = Math.max(B, C);
				CC = Math.min(B, C);
			}
			if (AA == B) {
				BB = Math.max(A, C);
				CC = Math.min(A, C);
			}
			if (AA == C) {
				BB = Math.max(B, A);
				CC = Math.min(B, A);
			}
			
			
			if (AA >= (BB+CC)) {
				System.out.print("NAO FORMA TRIANGULO\n");
			}
			if ((AA * AA) == ((BB*BB) + (CC*CC))) {
				System.out.print("TRIANGULO RETANGULO\n");
			}
			if ((AA * AA) > ((BB*BB) + (CC*CC))) {
				System.out.print("TRIANGULO OBTUSANGULO\n");
			}
			 if ((AA * AA) < ((BB*BB) + (CC*CC))) {
				System.out.print("TRIANGULO ACUTANGULO\n");
			}
			if ((AA == BB) && (AA == CC)) {
				System.out.print("TRIANGULO EQUILATERO\n");
			}
			if (((AA == BB) && (AA != CC))|| ((AA == CC) && (AA != BB)) || ((BB == CC) && (BB != AA))) {
				System.out.print("TRIANGULO ISOSCELES\n");
			}
			
			input.close();
		}
}
