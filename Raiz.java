import java.text.DecimalFormat;
import java.util.Scanner;

public class Raiz {

	public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
			DecimalFormat df = new DecimalFormat("0.00");

			final int SIZE = 10;
			double[] a, b;

			a = new double[SIZE];
			b = new double[SIZE];

			for (int i = 0; i < SIZE; i++) {
			    System.out.println("Insira o valor " + (i + 1) + ":");
			    a[i] = ler.nextInt();
			    b[i] = Math.sqrt(a[i]);
			}


			for (int i = 0; i < SIZE; i++) {
			    if (i == 0) {
			        System.out.print("Vetor A = [" + df.format(a[i]) + ", ");
			    } else if (i == (SIZE - 1)) {
			        System.out.print(df.format(a[i]) + "]\n");
			    } else {
			        System.out.print(df.format(a[i]) + ", ");
			    }
			}
			for (int i = 0; i < SIZE; i++) {
			    if (i == 0) {
			        System.out.print("Vetor B = [" + df.format(b[i]) + ", ");
			    } else if (i == (SIZE - 1)) {
			        System.out.print(df.format(b[i]) + "]");
			    } else {
			        System.out.print(df.format(b[i]) + ", ");
			    }
			}
		}
	}
}

