package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] table = {1,2,3,4};
		int[] table2 = {5,6,7,8};
		
		System.out.println(tilStreng(table));
		System.out.println(posisjonTall(table, 3));
		System.out.println(tilStreng(settSammen(table, table2)));
	}

	// a) Anders
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b) Fredrik
	public static String tilStreng(int[] tabell) {
		String tekst= "[";
		for (int i=0; i<tabell.length; i++) {
			tekst=tekst + tabell[i];
			
			if (i!=tabell.length-1) {
				tekst=tekst + ",";
			}
		}
		tekst=tekst + "]";
		return tekst;
		
		
	}

	// c) Sivert
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d) Anders
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e) Fredrik
	public static int posisjonTall(int[] tabell, int tall) {

		boolean exists =false;
		int i=0;
		while(!exists && i<tabell.length) {
			if (tabell[i]==tall) {
				exists=true;
				
				return i;
			}
			else i++;
		}
		return -1;

	}

	// f) Sivert
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g) Anders
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h) Fredrik
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] newTable = new int[tabell1.length + tabell2.length];
		int i;
		for (i=0; i<tabell1.length; i++) {
			newTable[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			newTable[i]=tabell2[j];
			i++;
		}
		return newTable;
	}
}
