package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
	int[][] matrise = new int[][] {
		{1,2,3},{4,5,6}
	};
	
	int[][] matriseTo = new int[][] {
		{7,8},{9,10},{11,12}
	};
	int[][] matriseSymbol = new int[][] {
		{0,0,1,1,1,1,0,0},
		{0,1,0,0,0,0,1,0},
		{0,1,0,0,0,0,1,0},
		{0,0,1,1,1,1,0,0},
		{0,1,0,0,0,0,1,0},
		{0,1,0,0,0,0,1,0},
		{0,1,0,0,0,0,1,0},
		{0,0,1,1,1,1,0,0},
	};
	System.out.println("a)");
	skrivUt(matrise);
	
	System.out.println("b)");
	System.out.println(tilStreng(matrise));
	
	System.out.println("c)");
	skrivUt(speile(matriseSymbol));
	
	System.out.println("d)");
	System.out.println(erLik(matrise, matriseTo));
	
	System.out.println("f)");
	skrivUt(multipliser(matrise,matriseTo));

	}
	
	// a)Fredrik
	public static void skrivUt(int[][] matrise) {
		
		for (int[] v:matrise) {
			int i=0;
			for(int w:v) {
				System.out.print(" " + w);
			}
			System.out.println();
		}
	}

	// b)sivert
	public static String tilStreng(int[][] matrise) {
		String streng="";
		for (int i=0; i<matrise.length; i++) {
			streng = streng + "\n";
			for (int j=0; j<matrise[i].length; j++) {
				streng = streng + matrise[i][j];
			}
		}
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

		int[][] speil =new int[matrise.length][matrise[0].length];
		
		for (int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[i].length; j++) {
				speil[j][i]=matrise[i][j];
			}
		}
		return speil;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		if(a[0].length==b.length) {
			int[][] table=new int[a.length][a.length];
			
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<a.length;j++) {
					int sum=0;
					
					for (int k=0; k<a[i].length;k++) {
						sum=sum + (a[i][k]*b[k][j]);
					}
					
					table[i][j]=sum;
				}
			}
			
			return table;
			
		}else{
			return null;
		}
	
	}
}
