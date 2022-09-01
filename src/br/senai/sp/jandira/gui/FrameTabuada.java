package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import br.senai.sp.jandira.model.*;
import br.senai.sp.jandira.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fontDosLabels;
	public Color corDaFonte;
	public Color corLetraCaixa;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Obter a instância do painel de conteúdo

		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		
		// Criar os componentes da tela e colocar no painel(container)
		
		JLabel labelTabuada  = new JLabel();
		labelTabuada.setText("Tabuada 3.5");
		labelTabuada.setBounds(60, 10, 100, 40);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);
		
		JLabel labelIntroducao = new JLabel();
		labelIntroducao.setText("Abandone a tão ultrapassada calculadora e me use (¬‿¬) ");
		labelIntroducao.setBounds(60, 50, 400, 20);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(30, 100, 200, 20);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(300, 100, 100, 20);
		textMultiplicando.setForeground(corLetraCaixa);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Multiplicador Mínimo:");
		labelMinMultiplicador.setBounds(30, 130, 200, 20);
		labelMinMultiplicador.setFont(fontDosLabels);
		labelMinMultiplicador.setForeground(corDaFonte);
		
		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(300, 130, 100, 20);
		textMultiplicando.setForeground(corLetraCaixa);
		
		
		// Adicionar componentes ao painel(Container)

		
		tela.add(labelTabuada);
		tela.add(labelIntroducao);
		tela.add(labelMultiplicando);
		tela.add(textMultiplicando);
		tela.add(labelMinMultiplicador);
		tela.add(textMinMultiplicador);
		tela.setVisible(true);
	}
	
}
