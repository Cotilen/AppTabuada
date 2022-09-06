package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Modelos;

public class AppTabuada {

	public static void main(String[] args) {

		Modelos tabuada = new Modelos();
		tabuada.minMultiplicador = 35;
		tabuada.maxMultiplicador = 78;
		tabuada.multiplicando = 23;

//	tabuada.getTabuada();
//	tabuada.getResultado();

		FrameTabuada tela = new FrameTabuada();
		tela.altura = 600;
		tela.largura = 400;
		tela.titulo = "Tabuada";
		tela.criarTela();

	}
}
