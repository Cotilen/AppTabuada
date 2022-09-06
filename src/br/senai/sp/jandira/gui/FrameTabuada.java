package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.senai.sp.jandira.model.*;
import br.senai.sp.jandira.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
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

		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 3.5");
		labelTabuada.setBounds(50, 10, 100, 40);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);

		JLabel labelIntroducao = new JLabel();
		labelIntroducao.setText("Abandone a tão ultrapassada calculadora e me use (¬‿¬) ");
		labelIntroducao.setBounds(50, 50, 400, 20);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 100, 200, 20);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(250, 100, 100, 20);
		textMultiplicando.setForeground(corLetraCaixa);

		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Multiplicador Mínimo:");
		labelMinMultiplicador.setBounds(20, 130, 200, 20);
		labelMinMultiplicador.setFont(fontDosLabels);
		labelMinMultiplicador.setForeground(corDaFonte);

		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(250, 130, 100, 20);
		textMultiplicando.setForeground(corLetraCaixa);

		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Multiplicador Máximo");
		labelMaxMultiplicador.setBounds(20, 160, 200, 20);
		labelMaxMultiplicador.setFont(fontDosLabels);
		labelMaxMultiplicador.setForeground(corDaFonte);

		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(250, 160, 100, 20);
		textMaxMultiplicador.setForeground(corLetraCaixa);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 190, 150, 40);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 190, 150, 40);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(20, 240, 160, 30);
		
		JList<String> listResultados = new JList<String>();
		
		JScrollPane scroll = new JScrollPane(listResultados);
		scroll.setBounds(20, 280, 300, 200);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Modelos tabuada = new Modelos();
				tabuada.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());
				tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());

				String[]
			}
		});

//		 Adicionar componentes ao painel(Container)

		tela.add(labelTabuada);
		tela.add(labelIntroducao);
		tela.add(labelMultiplicando);
		tela.add(textMultiplicando);
		tela.add(labelMinMultiplicador);
		tela.add(textMinMultiplicador);
		tela.add(labelMaxMultiplicador);
		tela.add(textMaxMultiplicador);
		tela.add(buttonCalcular);
		tela.add(buttonLimpar);
		tela.add(labelResultado);
		tela.add(scroll);
		tela.setVisible(true);
	}

}
