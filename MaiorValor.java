import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        final int SIZE = 10;
        int[] a;
        int menor, maior = 0;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + ":");
            a[i] = ler.nextInt();
        }

        menor = a[0];

        for (int i = 0; i < SIZE; i++) {
            if (a[i] > maior) {
                maior = a[i];
            } else if (a[i] < menor) {
                menor = a[i];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor A = [" + a[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);


	}

}
