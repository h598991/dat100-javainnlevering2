package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] table = {1,2,3,4};
		
		System.out.println(tilStreng(table));
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

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

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

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
