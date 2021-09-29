package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
	int[][] matrise = new int[][] {
		{1,2,3},{4,5,6},{7,8,9}
	};
	skrivUt(matrise);
	}
	
	// a)Fredrik
	public static void skrivUt(int[][] matrise) {
		
		for (int i=0; i<matrise.length; i++) {
			System.out.print("{");
			for(int j=0; j<matrise[i].length; j++) {
				System.out.print(matrise[i][j]);
				if(j!=matrise[i].length-1) {
					System.out.print(",");
				}
			}
			System.out.println("}");
		}
	}

	// b)sivert
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)Anders
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)Fredrik
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
