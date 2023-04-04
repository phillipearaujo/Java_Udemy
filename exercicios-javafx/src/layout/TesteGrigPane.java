package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGrigPane extends GridPane {

	public TesteGrigPane() {
		
		// elementos orientados por linhas e colunas

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc()); // adiciona as linhas na tela
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc()); // adiciona as colunas na tela
		
		setVgap(10);
		setHgap(10);
		
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);

	}
	
	/*
	 *  Os métodos ColumnConstraints e RowContraints criam as colunas e linhas respectivamente 
	 *  na tela. Usamos essas referencias para posicionar os elementos.
	 */
	
	public ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20); // define o percentual ocupado na tela
		cc.setFillWidth(true); // este atributo preenche a largura da tela
		return cc;
	}

	public RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20); // define o percentual ocupado na tela
		rc.setFillHeight(true); // este atributo preenche a altura da tela
		return rc;
	}

}
