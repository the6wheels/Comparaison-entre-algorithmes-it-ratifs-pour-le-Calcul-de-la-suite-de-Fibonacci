package algoTP1;

import java.math.BigInteger;

//A REMPLIR OBLIGATOIREMENT

//Nom : Hadjazi
//Prénom: Mohammed Hisham
//Spécialité: RSSI

//Nom : Amuer
//Prénom: Wassim Malik
//Spécialité: RSSI

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// le main ne doit contenir que les appels des méthodes, l'affichage des
		// résultats et des temps d'exécution
		// le code des méthodes est développé à l'extérieur du main
		// les 3 méthodes doivent s'exécuter séquentiellement

		long startTime;
		long endTime;
		float res;

		Scanner UserInput = new Scanner(System.in);
		System.out.print("Donner la valeur de n:");
		int n = UserInput.nextInt();

/////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("*****Résultat avec un tableau de taille n+1 *****:");
		startTime = System.nanoTime();
		System.out.println("F(" + n + ") = " + methode1(n));

		endTime = System.nanoTime();
		res = (float) (endTime - startTime) / 1000000;
		System.out.println("Temps de calcul :" + res + "  ms");
		System.out.print("    ");
		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("*****Résultat avec 2 variables. *****:");
		startTime = System.nanoTime();
		System.out.println("F(" + n + ") = " + methode2(n));

		endTime = System.nanoTime();
		res = (float) (endTime - startTime) / 1000000;
		System.out.println("Temps de calcul :" + res + "  ms");
		System.out.print("    ");
		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("*****Résultat avec tableau de taille 2*****:");

		startTime = System.nanoTime();
		System.out.println("F(" + n + ") = " + methode3(n));

		endTime = System.nanoTime();
		res = (float) (endTime - startTime) / 1000000;
		System.out.println("Temps de calcul :" + res + "  ms");
		System.out.print("    ");
		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println("*****Résultat avec 3 Variables*****:");
//
//		startTime = System.nanoTime();
//		System.out.println("F(" + n + ") = " + methode4(n));
//
//		endTime = System.nanoTime();
//		res = (float) (endTime - startTime) / 1000000;
//		System.out.println("Temps de calcul :" + res + "  ms");
//		System.out.print("    ");
//		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println("*****Résultat avec Recursivity*****:");
//
//		startTime = System.nanoTime();
//		System.out.println("F(" + n + ") = " + methode4(n));
//
//		endTime = System.nanoTime();
//		res = (float) (endTime - startTime) / 1000000;
//		System.out.println("Temps de calcul :" + res + "  ms");
//		System.out.print("    ");
//		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println("*****Résultat avec  Binet's Math Formula*****:");
//
//		startTime = System.nanoTime();
//		System.out.println("F(" + n + ") = " + methode5(n));
//
//		endTime = System.nanoTime();
//		res = (float) (endTime - startTime) / 1000000;
//		System.out.println("Temps de calcul :" + res + "  ms");
//		System.out.print("    ");
//		System.out.println("  ");

/////////////////////////////////////////////////////////////////////////////////////////////////

//System.out.println("*****Résultat avec Formula*****:");
//
//startTime = System.nanoTime();
//System.out.println("F(" + n + ") = " + methode6(n));
//
//endTime = System.nanoTime();
//res = (float) (endTime - startTime) / 1000000;
//System.out.println("Temps de calcul :" + res + "  ms");
//System.out.print("    ");
//System.out.println("  ");
	} // fin du main

	// Fibonacci using Array of size n

static BigInteger methode1(int n) {

	
	if (n < 2) {
		return BigInteger.valueOf(n);
	} else
	
	{
		
		BigInteger[] fib = new BigInteger[n+1];
	
		fib[0] = BigInteger.valueOf(0);
		fib[1] = BigInteger.valueOf(1);
	
		for (int i = 2; i < n+1 ; i++) {
			fib[i] = fib[i - 1].add(fib[i - 2]);
		}
	
		return fib[n];
	}
	}

// Fibonacci using 2 variables

	static BigInteger methode2(int n) {

		if (n < 2) {
			return BigInteger.valueOf(n);
		} else
		{
		BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1);
		n = n - 2;
		while (n > 0) {

			b = a.add(b);
			a = b.subtract(a);
			n--;
		}
		return (a.add(b));
	}
	}

	// Fibonacci using Array of size 2

	static BigInteger methode3(int n) {

		if (n < 2) {
			return BigInteger.valueOf(n);
		} else

		{

			BigInteger[] fib = new BigInteger[2];
			fib[0] = BigInteger.valueOf(0);
			fib[1] = BigInteger.valueOf(1);
			n = n - 2;
			while (n > 0) {

				fib[1] = fib[0].add(fib[1]);
				fib[0] = fib[1].subtract(fib[0]);
				n--;
			}
			return (fib[0].add(fib[1]));

		}
	}

//	// Fibonacci using 3 variables
//
//	static BigInteger methode4(int n) {
//
//		if (n < 2) {
//			return BigInteger.valueOf(n);
//		} else
//
//		{
//			BigInteger v1 = BigInteger.valueOf(0), v2 = BigInteger.valueOf(1), v3 = BigInteger.valueOf(0);
//			for (int i = 1; i <= n; ++i) {
//				v3 = v1.add(v2);
//				v1 = v2;
//				v2 = v3;
//			}
//
//			return (v1);
//		}
//	}
//
////Fibonacci using recurcion
//
//	static BigInteger methode5(int n) {
//
//		if (n < 2) {
//			return BigInteger.valueOf(n);
//		} else
//
//			return methode5(n - 2).add(methode5(n - 1));
//
//	}
//
////Fibonacci using math formula 1
//
//	
//
//	 static BigInteger methode6(int n)
//	    {
//	        BigInteger a = BigInteger.valueOf(0);
//	        BigInteger b = BigInteger.valueOf(1);
//	        BigInteger c = BigInteger.valueOf(1);
//	        for (int j=2 ; j<=n ; j++)
//	        {
//	            c =  a.add(b);
//	            a = b;
//	            b = c;
//	        }
//	  
//	        return (b);
//	    }	
//	
//	
}// fin de la classe