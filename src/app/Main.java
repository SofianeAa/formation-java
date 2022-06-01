package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// commenter/decommenter : CTRL + shilt + C
	// indenter : CTRL + shilt + F

	// Represente la methode principale, d'entree / sortie de notre programme
	// Il ne peut y avoir qu'une methode [...] main(String[] args) dans une
	// application
	public static void main(String[] args) {

//		System.out.print("Hello print() !");
//		System.out.println("Hello ... !");
//		System.out.println("Hello println() !");
//
//		String hello = "Hello";
//		System.out.println(hello);
//
//		int x = 5;
//		System.out.println(x);
//		Integer y = 6;
//		System.out.println(y);
//
//		System.out.println("------------------------------------------------------------------");
//
//		// replace(old,new) : permet de remplacer toute occurrence de la chaıne old
//		// dans la chaıne courante par new et retourne la nouvelle chaıne
//		String str = "bonjour les bons jours";
//		String str2 = str.replace("jour", "soir");
//		System.out.println(str2);
//
//		System.out.println("------------------------------------------------------------------");
//
//		// indexOf(x) : retourne l’indice de la premiere occurrence de la valeur de x
//		// dans la chaıne, -1 sinon.
//		Integer position1 = str.indexOf("bon");
//		System.out.println(position1); // Affiche 0
//
//		int position2 = str.indexOf("bon", 3);
//		System.out.println(position2); // Affiche 12
//
//		Integer z = 2;
//		String str3 = z.toString();
//		System.out.println(str3); // Affiche "2"
//
//		int v = 2;
//		String str4 = ((Integer) v).toString();
//		System.out.println(str4); // Affiche "2"
//
//		int w = 4;
//		String str5 = Integer.toString(w);
//		System.out.println(str5);
//
//		System.out.println("------------------------------------------------------------------");

		// Pas besoin de convertir un type primitif vers son type Objet / Wrapper
//		Integer n = 2;
//		int m = n;
//		System.out.println(m);
//
//		int k = 3;
//		Integer j = k;
//		System.out.println(j);
//
//		System.out.println("------------------------------------------------------------------");

		// Post-incrementation
//		int i = 2;
//		int f = i += 2; // => i = i + 2

//		System.out.println(i); // Affiche 3
//		System.out.println(f); // Affiche 2
//
//		// Pre-incrementation
//		int a = 2;
//		int b = ++a;
//
//		System.out.println(a); // Affiche 3
//		System.out.println(b); // Affiche 3
//
//		// Post-incrementation
//		int c = 2;
//		int d = i += 2; // => i = i + 2

//		System.out.println(i); // Affiche 3
//		System.out.println(d); // Affiche 2
//
//		System.out.println("------------------------------------------------------------------");
//
//		System.out.println("bon" + " " + "jour");
//
//		int num1 = 3;
//		int num2 = 5;
//		int result = num1 + num2;
//		System.out.println(result);

//		System.out.println("------------------------------------------------------------------");
//
//		float floatNum = 4.95f;
//		System.out.println(floatNum);
//
//		char myChar = 'F';
//		System.out.println(myChar);
//
//		boolean bool = true;
//		System.out.println(bool);
//
//		int num3 = 100000;
//		System.out.println(num3);
//
//		long numLong = 1000000000L;
//		System.out.println(numLong);
//
//		double dble = 100.99d;
//		System.out.println(dble);
//
//		System.out.println("------------------------------------------------------------------");
//
//		// Scanner permet à un utilisateur d’écrire une valeur et au programme de lire
//		// cette valeur
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Ecrire un nombre, svp ?");

		// Lit l'entier ecrit par l'utilisateur et l affecte a la variable nombre

//		try {
//			int nombre = scanner.nextInt();
//			System.out.println(nombre);
//		} catch (InputMismatchException e) {
//			System.out.println("Veuillez rentre un nombre, svp !");
//		}
//				
//		System.out.println("bon" + " " + "jour");
//		
//		
//		
//		for (int testboucle = 0; testboucle >= 5; testboucle++ ) {
//			System.out.println(testboucle);
//		}

//		for (int nombrePair = 0; nombrePair <= 10; nombrePair++) {
//			if (nombrePair % 2 == 0) {
//				System.out.println(nombrePair);
//			}
//		}

//		for (int nombrePair2 = 0; nombrePair2 <= 10; nombrePair2 +=2) {
//			System.out.println(nombrePair2);
//		
//		}

//		while (true){
//		    Scanner nombreEntier = new Scanner(System.in);
//		    System.out.println("Tapez un nombre : ");
//		    try {
//		        int chiffre = nombreEntier.nextInt();
//		        nombreEntier.close();
//		        System.out.println(chiffre%2==0 ? "Pair" : "Impair");
//		        break;
//		    } catch (Exception e) {
//		        System.out.println("Pas un entier");
//		    }
//		}

//		try (Scanner scanner = new Scanner(System.in)) {
//
//			System.out.println("Veuillez saisir un premier nombre");
//			int nb1 = scanner.nextInt();
//
//			System.out.println("Veuillez saisir un seconde nombre");
//			int nb2 = scanner.nextInt();
//
//			System.out.println("Veuillez saisir le dernier nombre");
//			int nb3 = scanner.nextInt();
//
//			if (nb1 > nb2 && nb1 > nb3) {
//				System.out.println(nb1 + " est le plus grand nombre");
//			} else if (nb2 > nb1 && nb2 > nb3) {
//				System.out.println(nb2 + " est le plus grand nombre");
//			} else {
//
//				System.out.println(nb3 + " est le plus grand nombre");
//			}
//		}
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Veuillez saisir une valeur en minutes");
			double minute = scanner.nextDouble();
			long nbAnnees = (long)minute/525600;
			long nbJours = ((long)minute%525600)/1440;
			
			System.out.println((int)minute+" minutes est approxymativement " +nbAnnees+ " années et " +nbJours+("Jours"));
			
			
		}
		
		

	}

}
