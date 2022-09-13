package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import br.senai.sp.jandira.model.*;
import br.senai.sp.jandira.*;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fontDosLabels;
	public Color corDaFonte;
	public Font fontIntroducao;


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
		labelTabuada.setBounds(80, 10,150, 40);
		labelTabuada.setFont(fontDosLabels);
		labelTabuada.setForeground(corDaFonte);

		JLabel labelIntroducao = new JLabel();
		labelIntroducao.setText("Abandone a tão ultrapassada calculadora e me use (¬‿¬) ");
		labelIntroducao.setBounds(50, 50, 400, 20);
		labelIntroducao.setFont(fontIntroducao);
		labelIntroducao.setForeground(corDaFonte);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 100, 200, 20);
		labelMultiplicando.setFont(fontDosLabels);
		labelMultiplicando.setForeground(corDaFonte);

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(250, 100, 100, 20);

		
		textMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textMultiplicando.setText(textMultiplicando.getText().replaceAll( "[^0-9]" , ""));
				if(textMultiplicando.getText().length() > 9) {
					
					JOptionPane.showMessageDialog(null, "Valor excedido","ERRO",JOptionPane.ERROR_MESSAGE);
					textMultiplicando.setText(textMultiplicando.getText().replaceAll( "[0-9]" , ""));
					
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Multiplicador Mínimo:");
		labelMinMultiplicador.setBounds(20, 130, 200, 20);
		labelMinMultiplicador.setFont(fontDosLabels);
		labelMinMultiplicador.setForeground(corDaFonte);

		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(250, 130, 100, 20);

		textMinMultiplicador.addKeyListener(new KeyListener() {
	
			
			@Override
			public void keyReleased(KeyEvent e) {
				textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll( "[^0-9]" , ""));
				
				if(textMinMultiplicador.getText().length() > 9) {
					
					JOptionPane.showMessageDialog(null, "Valor excedido","ERRO",JOptionPane.ERROR_MESSAGE);
					textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll( "[0-9]" , ""));
					
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
	
		});
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Multiplicador Máximo");
		labelMaxMultiplicador.setBounds(20, 160, 200, 20);
		labelMaxMultiplicador.setFont(fontDosLabels);
		labelMaxMultiplicador.setForeground(corDaFonte);

		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(250, 160, 100, 20);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 190, 150, 40);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 190, 150, 40);
		
		

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(20, 240, 160, 30);
		labelResultado.setFont(fontDosLabels);
		labelResultado.setForeground(corDaFonte);
		
		JList<String> listResultados = new JList<String>();
		
		JScrollPane scroll = new JScrollPane(listResultados);
		scroll.setBounds(20, 280, 300, 200);
		
		buttonCalcular.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				Modelos tabuada = new Modelos();
				if(textMaxMultiplicador.getText().isEmpty() || textMinMultiplicador.getText().isEmpty() || textMultiplicando.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Caixas Vazias","ERRO",JOptionPane.ERROR_MESSAGE);
					
				}else {
					
					tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
					tabuada.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());
					tabuada.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
				}
				if(tabuada.maxMultiplicador < tabuada.minMultiplicador) {
					
					JOptionPane.showMessageDialog(null, "minimo multiplicador maior que  o maximo multiplicador","ERRO",JOptionPane.ERROR_MESSAGE);
					
				}else {
					
					
					
					String[] resultados = tabuada.getTabuada();
					
					listResultados.setListData(resultados);
					scroll.setVisible(true);
					
					}
				
			}

		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				//scroll.setVisible(false);
				
				String[] limpar = {""};
				listResultados.setListData(limpar);
				
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
