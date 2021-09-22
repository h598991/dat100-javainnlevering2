package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] table = { 1, 2, 3, 4 };
		int[] table2 = { 5, 6, 7, 8 };

		System.out.println(tilStreng(table));
		System.out.println(posisjonTall(table, 3));
		System.out.println(tilStreng(settSammen(table, table2)));
		System.out.println(summer(table));
		System.out.println(tilStreng(reverser(table)));
	}

	// a) Anders
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < 4; i++) {
			System.out.print(tabell[i] + ",");
		}

	}

	// b) Fredrik
	public static String tilStreng(int[] tabell) {
		String tekst = "[";
		for (int i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];

			if (i != tabell.length - 1) {
				tekst = tekst + ",";
			}
		}
		tekst = tekst + "]";
		return tekst;

	}

	// c) Sivert
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;

//		int i = 0;
//		while (i<tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//		return sum;

//		for (int i=0; i<tabell.length; i++) {
//		sum += tabell[i];
//	} 
//	return sum;

	}

	// d) Anders
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;

		int i = 0;
		while (!funnet && i < tabell.length) {

			if (tabell[i] == tall) {
				funnet = true;
			}

			i++;
		}
		return funnet;

	}

	// e) Fredrik
	public static int posisjonTall(int[] tabell, int tall) {

		boolean exists = false;
		int i = 0;
		while (!exists && i < tabell.length) {
			if (tabell[i] == tall) {
				exists = true;

				return i;
			} else
				i++;
		}
		return -1;

	}

	// f) Sivert
	public static int[] reverser(int[] tabell) {
		
		int [] nyTabell = new int [tabell.length];
		for (int i=0; i<tabell.length/2; i++) {
			nyTabell[i]=tabell[tabell.length-i-1];
			
			
		}
		return nyTabell;
	}

	// g) Anders, som kan avgjere om ein array (tabell) av heiltal er sortert
	// stigande
	public static boolean erSortert(int[] tabell) {

		boolean rekkefolge=true;
		
		int i = 1;
		while(rekkefolge && i<tabell.length) {
			if (tabell[i] <= tabell[i-1]) {
				rekkefolge = false;
			}
				i++;
		}
		return rekkefolge;
		

	}

	// h) Fredrik
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] newTable = new int[tabell1.length + tabell2.length];
		int i;
		for (i = 0; i < tabell1.length; i++) {
			newTable[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			newTable[i] = tabell2[j];
			i++;
		}
		return newTable;
	}
}
