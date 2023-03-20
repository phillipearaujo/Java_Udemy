package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador"); // cria a janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // associa o evento de 
																	//fechar a tela ao encerramento da aplicação
		janela.setSize(600, 200); // define o tamanho da janela
		janela.setLayout(new FlowLayout()); // determina posição do botão na janela
		janela.setLocationRelativeTo(null); // centraliza a janela na tela
		
		JButton botao = new JButton("Clicar"); // cria um botão
		janela.add(botao); // adiciona o botão na janela
		
		botao.addActionListener(new ActionListener() { //adiciona ação ao botão
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!!!");
			}
		});
		
		janela.setVisible(true);
	}
}
