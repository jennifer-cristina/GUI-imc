package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600, 600);
		minhaTela.setTitle("Minha primeira janela");
		minhaTela.setLayout(null);
		
		// Criar os componentes da tela 
		
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade?");
		
		lblIdade.setBounds(20, 20, 150, 30);
		
		// Criar um botão escrito "Verificar" 
		
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		
		btnVerificar.setBounds(140, 50, 100, 30);
		
		// Criar um TexFiel
		
		JTextField txtInserirIdade = new JTextField();
		
		txtInserirIdade.setBounds(20, 50, 100, 30);
		
		// Criar o resultado
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(20, 90, 165, 30);
			
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtInserirIdade);
		minhaTela.getContentPane().add(lblIdade);
		minhaTela.getContentPane().add(btnVerificar);
		
		minhaTela.setVisible(true);
		
		// ******** Listerners de eventos
		// --- Mouse
		
		txtInserirIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltei o botão!");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertei o botão!");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saí do TextField!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Cheguei!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicou!");
				
			}
		});
		
		txtInserirIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());
				
			}
		});
		
		
		
	}
	
}
