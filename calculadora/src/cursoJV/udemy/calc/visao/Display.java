package cursoJV.udemy.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import cursoJV.udemy.calc.modelo.Memoria;
import cursoJV.udemy.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("JetBrains Mono", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20)); // posicionamento no display
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
