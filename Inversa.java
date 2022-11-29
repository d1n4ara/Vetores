import java.util.Scanner;

public class Inversa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        final int SIZE = 10;
        int[] a, b;

        a = new int[SIZE];
        b = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + ":");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            b[i] = a[SIZE - i - 1];
        }

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor A = [" + a[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.print(a[i] + "]\n");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor B = [" + b[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.print(b[i] + "]");
            } else {
                System.out.print(b[i] + ", ");
            }
        }

	}

}
