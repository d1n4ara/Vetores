import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {

	       try (Scanner ler = new Scanner(System.in)) {
			final int SIZE = 10;
	        int[] a;

	        a = new int[SIZE];

	        for (int i = 0; i < SIZE; i++) {
	            System.out.println("Insira o valor " + (i + 1) + ":");
	            a[i] = ler.nextInt();
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

	        System.out.println("Valores pares do vetor A:");
	        for (int i = 0; i < SIZE; i++) {
	            if (a[i] % 2 == 0) {
	                System.out.print(a[i] + " | ");
	            }
	        }
		}

	    }
	}

