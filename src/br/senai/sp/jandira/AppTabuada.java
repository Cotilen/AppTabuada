package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Modelos;

public class AppTabuada {

	public static void main(String[] args) {

//		Modelos tabuada = new Modelos();
//		tabuada.minMultiplicador = 35;
//		tabuada.maxMultiplicador = 78;
//		tabuada.multiplicando = 23;

//	tabuada.getTabuada();
//	tabuada.getResultado();

		FrameTabuada tela = new FrameTabuada();
		tela.altura = 600;
		tela.largura = 400;
		tela.titulo = "Tabuada";
		tela.fontDosLabels = new Font("Algerian",Font.BOLD , 15);
		tela.fontIntroducao = new Font("Calibri Light ", Font.BOLD, 12);
		tela.corDaFonte = new Color(255,255,255);
		tela.corDeFundoDaTela = new Color(0, 0, 0);
		tela.criarTela();
		
		
	}
}
