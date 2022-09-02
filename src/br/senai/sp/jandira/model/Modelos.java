package br.senai.sp.jandira.model;

public class Modelos {

	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public String[] tabuada;

	public void getTabuada() {

		int contador1 = minMultiplicador;
		int contador2 = 0;
		tabuada = new String[maxMultiplicador - minMultiplicador + 1];
		while (contador1 <= maxMultiplicador) {

			tabuada[contador2] = multiplicando + " X " + contador1 + " = " + multiplicando * contador1;
			contador1++;
			contador2++;

		}
	}
	
	public void getResultado() {
		
		
		
		
	}

}