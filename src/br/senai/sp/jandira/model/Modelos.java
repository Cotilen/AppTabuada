package br.senai.sp.jandira.model;

public class Modelos {

	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public String[] resultados;

	public void getTabuada() {

		int tamanhoResultado = maxMultiplicador - minMultiplicador + 1;
		resultados = new String[tamanhoResultado];

		int soma = 0;
		int somaMin = minMultiplicador;

		while (somaMin < maxMultiplicador) {

			resultados[soma] = multiplicando + " X " + somaMin + " = " + multiplicando * somaMin;
			soma++;
			somaMin++;

		}

	}

	public void getResultado() {

		int soma = 0;
		int somaMin = minMultiplicador;

		while (somaMin <= maxMultiplicador) {

			System.out.println(resultados[soma]);
			soma++;
			somaMin++;

		}

	}

}