package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
	int[][] matrise = new int[][] {
		{1,2,3},{4,5,6},{7,8,9}
	};
	
	int[][] matriseTo = new int[][] {
		{1,2,3},{4,5,6},{7,8,9}
	};
	skrivUt(matrise);
<<<<<<< Updated upstream
	System.out.println(erLik(matrise, matriseTo));
=======
	System.out.println(tilStreng(matrise));
>>>>>>> Stashed changes
	}
	
	// a)Fredrik
	public static void skrivUt(int[][] matrise) {
		
		for (int[] v:matrise) {
			System.out.print("{");
			int i=0;
			for(int w:v) {
				System.out.print(w);
				if (i!=v.length-1) {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println("}");
		}
	}

	// b)sivert
	public static String tilStreng(int[][] matrise) {
		String streng="[";
		for (int i=0; i<matrise.length; i++) {
			streng = streng + matrise[i];
			if (i != matrise.length - 1) {
				streng = streng + ",";
			}
			for (int j=0; j<matrise[i].length; j++) {
				streng = streng + matrise[j];
			}
		}
		streng = streng + "]";
		return streng;
	}

	// c)Anders
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)Fredrik
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik=true;
		int i=0;
		
		if(a.length!=b.length) {
			return false;
		}
		
		while (erLik && i<a.length) {
			int j=0;
			
			if(a[i].length!=b[i].length) {
				return false;
			}
			
			while(erLik && j<a[i].length) {
				if(a[i][j]!=b[i][j]) {
					erLik=false;
				}
				j++;
			}
			i++;
		}
		return erLik;
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
