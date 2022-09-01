package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Modelos;

public class AppTabuada {


	public static void main(String[] args) {
		
	FrameTabuada tela = new FrameTabuada();
	tela.altura = 600;
	tela.largura= 450;
	tela.titulo = "Tabuada";
//	tela.criarTela();
	
	
		Modelos tabuada = new Modelos();
		tabuada.minMultiplicador = 0;
		tabuada.maxMultiplicador = 10;
		tabuada.multiplicando = 5;
		
		
		System.out.println(tabuada);
		
        while (tabuada.minMultiplicador != tabuada.maxMultiplicador) {
		
		tabuada.minMultiplicador++;
		tabuada.getResult = tabuada.minMultiplicador * tabuada.multiplicando;
		System.out.println( tabuada.multiplicando + " X " + tabuada.minMultiplicador + " = " + tabuada.getResult);
		
}		
	}
}
