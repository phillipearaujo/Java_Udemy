package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {

		// elementos alinhados as bordas. Se ajustam ao tamanho da Caixa.

		Caixa c1 = new Caixa().comTexto("Top");
		setTop(c1); // define a posição do elemento na tela

		Caixa c2 = new Caixa().comTexto("Left");
		setLeft(c2); // define a posição do elemento na tela

		Caixa c3 = new Caixa().comTexto("Right");
		setRight(c3); // define a posição do elemento na tela

		Caixa c4 = new Caixa().comTexto("Bottom");
		setBottom(c4); // define a posição do elemento na tela

		Caixa c5 = new Caixa().comTexto("Center");
		setCenter(c5); // define a posição do elemento na tela

	}

}
